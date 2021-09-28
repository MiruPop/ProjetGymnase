package co.simplon.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import co.simplon.api.models.Gymnase;

public interface GymnaseRepository extends MongoRepository<Gymnase, String> {

//	@Query("{Ville:'?0'}")
	List<Gymnase> findByVille(@Param ("ville") String ville);
}
