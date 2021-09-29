package co.simplon.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.simplon.api.models.Gymnase;

@Repository
public interface GymnaseRepository extends MongoRepository<Gymnase, String> {

//	@Query("{Ville:'?0'}")
	List<Gymnase> findByVille(String ville);
	List<Gymnase> findBySeances_IdSportifEntraineur(int IdSportifEntraineur);
	Optional<Gymnase> findById(String id);
}
