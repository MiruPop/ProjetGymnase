package co.simplon.api.services;

import java.util.List;


import co.simplon.api.models.Gymnase;

public interface GymnaseService {

	List<Gymnase> getGymnasesParVille(String ville);
	
}
