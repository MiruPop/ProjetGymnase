package co.simplon.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.api.models.Gymnase;
import co.simplon.api.services.GymnaseServiceImpl;

@RestController
public class GymnaseRequetes {
	
	@Autowired
	private GymnaseServiceImpl gymnaseService;

	@GetMapping(path = "/gymnases/taille/{taille}")
	public List<Gymnase> gymParTaille(@PathVariable("taille") int taille) {
		return this.gymnaseService.getGymnasesParTaille(taille);
	}
	
	@GetMapping(path = "/gymnases/ville/{ville}")
	public List<Gymnase> gymParTaille(@PathVariable("ville") String ville) {
		return this.gymnaseService.getGymnasesParVille(ville);
	}
}
