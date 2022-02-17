package co.simplon.api.models;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.MongoId;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document ("Gymnases")
public class Gymnase {
	@Transient
    public static final String SEQUENCE_NAME = "Id_gymnase";
<<<<<<< HEAD

	@MongoId
	private ObjectId id;
=======
	
	@Id
	private String id;
>>>>>>> 2ed80bfb823c8a94dc6721fadf43575dbba5efff
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
