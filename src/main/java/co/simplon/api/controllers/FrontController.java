package co.simplon.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {
	
//	http://localhost:9000/accueil
	@RequestMapping(value = {"/", "/accueil"})
	public String getpageAccueil() {
		return "index";
	}
	
//	http://localhost:9000/login
	@RequestMapping(value = "/login")
	public String getpageLogin() {
		return "login";
	}
	
//	http://localhost:9000/sportif/all
	@RequestMapping(value = "/sportifs/all")
	public String getpageSportifs() {
		return "sportifList";
	}

}
