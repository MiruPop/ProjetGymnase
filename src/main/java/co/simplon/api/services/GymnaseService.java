package co.simplon.api.services;

import java.util.List;

import co.simplon.api.models.Gymnase;
import org.bson.types.ObjectId;

public interface GymnaseService {

	List<Gymnase> getGymnasesParVille(String ville);
	List<Gymnase> getSeancesParEntraineur(int IdSportifEntraineur);

    Gymnase getGymnaseParId(ObjectId id);

    List<Gymnase> getGymnasesParTaille(int taille);
}
