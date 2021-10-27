package co.simplon.api.services;

import java.util.List;
import co.simplon.api.models.Sportif;

public interface SportifService {
	List<Sportif> getSportifsParNomEtPrenom(String nom, String prenom);
	Sportif addSportif(Sportif sportif);
}
