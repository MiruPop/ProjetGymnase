package co.simplon.api.services;

import java.util.List;
import java.util.Optional;

import co.simplon.api.models.Gymnase;

public interface GymnaseService {

	List<Gymnase> getGymnasesParVille(String ville);
	List<Gymnase> getSeancesParEntraineur(int IdSportifEntraineur);
	Gymnase getGymnaseParId(String id);
}
