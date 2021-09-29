package co.simplon.api.services;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
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

	@Override
	public List<Gymnase> getSeancesParEntraineur(int IdSportifEntraineur) {

		return this.gymnaseRepository.findBySeances_IdSportifEntraineur(IdSportifEntraineur);
	}

	@Override
	public Gymnase getGymnaseParId(String id) {
		Optional<Gymnase> optionalGymnase = gymnaseRepository.findById(id);
		return optionalGymnase.orElseThrow();
	}


	public List<Gymnase> listeGyms() {
		return this.gymnaseRepository.findAll();
	}
	
	public boolean ajouterGymnase(Gymnase gymnase) {
		try {
			gymnaseRepository.save(gymnase);
			return true;
		} catch (Exception e) {
			log.debug("L'insertion n'a pas pu être réalisée");
		}
		return false;
	}
	
	public void modifierGymnase(Gymnase gymnase) {
		Gymnase gym = getGymnaseParId(gymnase.getId());

		gym.setIdGymnase(gymnase.getIdGymnase());
		gym.setNomGymnase(gymnase.getNomGymnase());
		gym.setAdresse(gymnase.getAdresse());
		
		gymnaseRepository.save(gymnase);
	}
	
	public boolean effacerGymnase(String id) {
		
		try {
			gymnaseRepository.deleteById(id);
			return true;
			
		} catch (Exception e) {
			log.debug("La donnée n'a pas pu être effacée");
			return false;
		}
	}

}
