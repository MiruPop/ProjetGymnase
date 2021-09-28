package co.simplon.api.models;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seance {

	@Field (name = "IdSportifEntraineur")
	private int idSportifEntraineur;
	@Field (name = "Jour")
	private String jour;
	@Field (name = "Horaire")
	private int horaire;
	@Field (name = "Duree")
	private int duree;
	@Field (name = "Libelle")
	private String libelle;

}
