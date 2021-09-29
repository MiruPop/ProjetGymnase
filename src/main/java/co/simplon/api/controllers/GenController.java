package co.simplon.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.api.models.Gymnase;
import co.simplon.api.models.Sportif;
import co.simplon.api.services.GymnaseServiceImpl;
import co.simplon.api.services.SportifServiceImpl;

@RestController
public class GenController {
	
	@Autowired
	private GymnaseServiceImpl gymnaseService;
	@Autowired
	private SportifServiceImpl sportifService;

//	http://localhost:9000/sportif/liste
//	@GetMapping(path = "/sportif/liste")
//	public List<Sportif> getAllSportifs() {
//		return sportifService.findAll();
//	}
	
//	http://localhost:9000/nom?nom=KERVADEC&prenom=Yann
	@GetMapping(path = "/nom")
	public List<Sportif> getAllSportifsParNom(@RequestParam String nom, @RequestParam String prenom) {
		return sportifService.getSportifsParNomEtPrenom(nom, prenom);
	}
	
//	http://localhost:9000/entraineur/1
	@GetMapping(path = "/entraineur/{idSportifEntraineur}")
	public List<Gymnase> getAllSeancesParEntraineur(@PathVariable("idSportifEntraineur") int idSportifEntraineur) {
		return gymnaseService.getSeancesParEntraineur(idSportifEntraineur);
	}
	
//	http://localhost:9000/gymnase/STAINS
	@GetMapping(path = "/gymnase/{ville}")
	public List<Gymnase> getGymnasesByCity(@PathVariable("ville") String ville) {
		return gymnaseService.getGymnasesParVille(ville);
	}

}
