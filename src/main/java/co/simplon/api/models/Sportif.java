package co.simplon.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sportif {

	@JsonProperty("_id")
	private String id;

	private int idSportif;
	private String nom;
	private String prenom;
	private String sexe;
	private int age;
	private int idSportifConseiller;
	private Sports sports;

	public Sportif() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getIdSportif() {
		return idSportif;
	}

	public void setIdSportif(int idSportif) {
		this.idSportif = idSportif;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getIdSportifConseiller() {
		return idSportifConseiller;
	}

	public void setIdSportifConseiller(int idSportifConseiller) {
		this.idSportifConseiller = idSportifConseiller;
	}

	public Sports getSports() {
		return sports;
	}

	public void setSports(Sports sports) {
		this.sports = sports;
	}

}
