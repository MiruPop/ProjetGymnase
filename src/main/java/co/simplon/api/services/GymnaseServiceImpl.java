package co.simplon.api.services;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.api.exceptions.ItemNotFountException;
import co.simplon.api.models.Gymnase;
import co.simplon.api.repository.GymnaseRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class GymnaseServiceImpl implements GymnaseService {

	@Autowired
	GymnaseRepository gymnaseRepository;

/*********** SELECT PAR ID ***********/
	
	@Override
	public Gymnase getGymnaseParId(ObjectId id) {
		Optional<Gymnase> optionalGymnase = gymnaseRepository.findById(id);

		return optionalGymnase.orElseThrow(() -> new ItemNotFountException("Pas d'élément avec l'id " + id));
	}

/*********** READ ALL ***********/
	
	public List<Gymnase> listeGyms() {
		return this.gymnaseRepository.findAll();
	}

/*********** CREATE ***********/
	
//vers Spring/Thymeleaf
	public boolean ajouterGymnase(Gymnase gymnase) {
		try {
			gymnaseRepository.save(gymnase);
			return true;
		} catch (Exception e) {
			log.debug("L'insertion n'a pas pu être réalisée");
		}
		return false;
	}

//vers. Rest
	public Gymnase addGymnase(Gymnase gymnase) {
		return gymnaseRepository.save(gymnase);
	}

/*********** UPDATE ***********/
	
	//méthode Rest:
	 public Gymnase updateGymnase(Gymnase gymnase) {
	 	return gymnaseRepository.save(gymnase);
	 }


/*********** DELETE ***********/
//vers Spring/Thymeleaf
	public boolean effacerGymnase(ObjectId id) {

		try {
			gymnaseRepository.deleteById(id);
			return true;

		} catch (Exception e) {
			log.debug("La donnée n'a pas pu être effacée");
			return false;
		}
	}

//vers. Rest
	public void deleteGymnase(Gymnase gymnase) {
		gymnaseRepository.delete(gymnase);
	}


/*********** FILTRES ***********/
	
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
	public List<Gymnase> getGymnasesParTaille(int taille) {
		return gymnaseRepository.findAllBySurfaceGreaterThanEqual(taille);
	}

}
