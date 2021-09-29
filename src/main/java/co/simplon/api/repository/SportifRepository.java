package co.simplon.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.simplon.api.models.Sportif;

@Repository
public interface SportifRepository extends MongoRepository<Sportif, String> {
	List<Sportif> findByNomAndPrenom(String nom, String prenom);
}
