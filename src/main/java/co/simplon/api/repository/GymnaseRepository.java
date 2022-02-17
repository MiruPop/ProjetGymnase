package co.simplon.api.repository;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.simplon.api.models.Gymnase;

@Repository
public interface GymnaseRepository extends MongoRepository<Gymnase, ObjectId> {

	List<Gymnase> findByVille(String ville);
	List<Gymnase> findBySeances_IdSportifEntraineur(int IdSportifEntraineur);
	Optional<Gymnase> findById();
	
	List<Gymnase> findAllBySurfaceGreaterThanEqual(int taille);
}
