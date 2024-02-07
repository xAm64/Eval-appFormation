package fr.fms.entities;

import java.util.Date;

public class Commande {
	
	private int idCommande;
	private double prixTotal;
	private int idUser;
	private int idFormation;
	
	//Constructeurs
	//Complet
	public Commande(int idCommande, double prixTotal, int idFormation, int idUser) {
		super();
		this.idCommande = idCommande;
		this.prixTotal = prixTotal;
		this.idFormation = idFormation;
		this.idUser = idUser;
	}
	//Minimum
	public Commande(double prixTotal, int idFormation, int idUser) {
		super();
		this.prixTotal = prixTotal;
		this.idFormation = idFormation;
		this.idUser = idUser;
	}
	
	//Getters et Setters
	//ID (Uniquement consultable)
	public int getIdCommande() {
		return idCommande;
	}
	
	//Prix
	public double getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}
	
	//clés étrangères
	public int getIdUser() {
		return idUser;
	}
	public int getIdFormation() {
		return idFormation;
	}
}
