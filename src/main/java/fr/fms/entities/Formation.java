package fr.fms.entities;

public class Formation {
	
	private int idFormation;
	private String titre;
	private double prix;
	private String description;
	private String lieu;
	
	//Constructeur
	//Complet
	public Formation(int idFormation, String titre, double prix, String description, String lieu) {
		super();
		this.idFormation = idFormation;
		this.titre = titre;
		this.prix = prix;
		this.description = description;
		this.lieu = lieu;
	}
	//minimum
	public Formation(String titre, double prix, String description, String lieu) {
		super();
		this.titre = titre;
		this.prix = prix;
		this.description = description;
		this.lieu = lieu;
	}
	
	//Getters et Setters
	//ID (non éditable)
	public int getIdFormation() {
		return idFormation;
	}
	
	//titre
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}

	//prix
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

	//description
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	//Lieu
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
}
