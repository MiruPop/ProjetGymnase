package co.simplon.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.simplon.api.models.Gymnase;
import co.simplon.api.services.GymnaseServiceImpl;

@Controller
@RequestMapping(value = "/gymnase")
public class GymnaseCRUDController {
	@Autowired
	private GymnaseServiceImpl gymnaseService;

	// READ

//	http://localhost:9000/gymnase/liste
	@GetMapping(path = "/liste")
	public String listeGymnases(Model model) {
		model.addAttribute("listeGymnases", gymnaseService.listeGyms());
		return "gymnaseList";
	}

//	CREATE
	@GetMapping(path = "/new")
	public String showSignUpForm(Gymnase g) {
		return "gymnaseAddForm";
	}

	@PostMapping(path = "/ajouter")
	public String ajouterGymnase(@Valid Gymnase g, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "gymnaseAddForm";
		}
		gymnaseService.ajouterGymnase(g);
		return "redirect:liste";
	}
	
//	UPDATE
    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable("id") String id, Model model) {
        Gymnase gym = gymnaseService.getGymnaseParId(id);
        
        model.addAttribute("gymnase", gym);
        return "gymnaseUpdateForm";
    }
    @PostMapping("/modifier/{id}")
    public String modifierPersonne(@PathVariable("id") String id, @Valid Gymnase g, 
      BindingResult result, Model model) {
        if (result.hasErrors()) {
            g.setId(id);
            return "gymnaseUpdateForm";
        }
        gymnaseService.modifierGymnase(g);
        return "redirect:/gymnase/liste";
    }

//	DELETE
	@GetMapping("/delete/{id}")
	public String deleteGymnase(@PathVariable String id) {
		
		gymnaseService.effacerGymnase(id);
		System.out.println("delete ok");
		
	    return "redirect:/gymnase/liste";
	}
}
