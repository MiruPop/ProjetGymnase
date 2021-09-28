package co.simplon.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.api.models.Gymnase;
import co.simplon.api.services.GymnaseServiceImpl;

@RestController
public class GenController {
	
	@Autowired
	private GymnaseServiceImpl gymnaseService;
	
	@GetMapping(path = "/")
	public List<Gymnase> getAllGymnases() {
		return gymnaseService.listeGyms();
	}
	
//	http://localhost:9000/ville?ville=STAINS
	@GetMapping(path = "/ville")
	public List<Gymnase> getGymnasesByCity(@RequestParam String ville) {
		return gymnaseService.getGymnasesParVille(ville);
	}

}
