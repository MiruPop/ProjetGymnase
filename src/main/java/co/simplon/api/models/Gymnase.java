package co.simplon.api.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document ("Gymnases")
public class Gymnase {

	@Id
	private String id;
	@Field (name = "IdGymnase")
	private int idGymnase;
	@Field (name = "NomGymnase")
	private String nomGymnase;
	@Field (name = "Adresse")
	private String adresse;
	@Field (name = "Ville")
	private String ville;
	@Field (name = "Surface")
	private int surface;
	@Field (name = "Seances")
	private List<Seance> seances;

}
