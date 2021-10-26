package co.simplon.api.controllers;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {
	
//	http://localhost:9000/accueil
	@GetMapping(path = "/accueil")
	public String getpageAccueil() {
		return "index";
	}

}
