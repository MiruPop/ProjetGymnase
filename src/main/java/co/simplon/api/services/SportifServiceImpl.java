package co.simplon.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.api.models.Sportif;
import co.simplon.api.repository.SportifRepository;

@Service
public class SportifServiceImpl implements SportifService {

	@Autowired
	SportifRepository sportifRepository;

	@Override
	public List<Sportif> getSportifsParNomEtPrenom(String nom, String prenom) {
		
		return this.sportifRepository.findByNomAndPrenom(nom, prenom);
	}

	public List<Sportif> findAll() {

		return this.sportifRepository.findAll();
	}

}
