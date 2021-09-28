package co.simplon.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.api.models.Gymnase;
import co.simplon.api.repository.GymnaseRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class GymnaseServiceImpl implements GymnaseService {

	@Autowired
	GymnaseRepository gymnaseRepository;
	
	@Override
	public List<Gymnase> getGymnasesParVille(String ville) {

		log.debug("Salles pour la ville de {}", ville, this.gymnaseRepository.findByVille(ville));
		return this.gymnaseRepository.findByVille(ville);
	}
	
	public List<Gymnase> listeGyms() {
		return this.gymnaseRepository.findAll();
	}

}
