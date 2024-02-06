package fr.fms.entities;

public class Utilisateur {
	private int idUser;
	private String nom;
	private String email;
	
	//Constructeurs
	//Complet
	public Utilisateur(int idUser, String nom, String email) {
		super();
		this.idUser = idUser;
		this.nom = nom;
		this.email = email;
	}
	//Minimum
	public Utilisateur(String nom, String email) {
		super();
		this.nom = nom;
		this.email = email;
	}
	
	//Getters et Sttters
	//ID
	public int getIdUser() {
		return idUser;
	}
	
	//Noms
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	//Email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
