package co.simplon.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
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
//	http://localhost:9000/gymnase/tous
	@GetMapping(path = "/tous")
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
	public String ajouterGymnase (@Valid Gymnase g, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "gymnaseAddForm";
		}
		gymnaseService.ajouterGymnase(g);
		return "redirect:tous";
	}
	
//	UPDATE
    @GetMapping("/editer/{id}")
    public String showUpdateForm(@PathVariable("id") String id, Model model) {
		ObjectId objectId = new ObjectId(id);
        Gymnase gym = gymnaseService.getGymnaseParId(objectId);
        
        model.addAttribute("gymnase", gym);
        return "gymnaseUpdateForm";
    }
    @GetMapping("/modifier/{id}")
    public String modifierPersonne(@PathVariable("id") String id, @Valid Gymnase g, BindingResult result, Model model) {
		ObjectId objectId = new ObjectId(id);
        if (result.hasErrors()) {
            g.setId(objectId);
            return "gymnaseUpdateForm";
        }
        gymnaseService.modifierGymnase(g);
        
        return "redirect:/gymnase/tous";
    }

//	DELETE
	@GetMapping("/effacer/{id}")
	public String deleteGymnase(@PathVariable("id") String id) {
		ObjectId objectId = new ObjectId(id);
		gymnaseService.effacerGymnase(objectId);
		System.out.println("delete ok");
		
	    return "redirect:/gymnase/tous";
	}
}
