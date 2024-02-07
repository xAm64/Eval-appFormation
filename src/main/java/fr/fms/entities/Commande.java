package fr.fms.entities;

import java.util.Date;

public class Commande {
	
	private int idCommande;
	private double prixTotal;
	private int idUser;
	private int idFormation;
	
	//Constructeurs
	//Complet
	public Commande(int idCommande, double prixTotal, int idUser, int idCommande) {
		super();
		this.idCommande = idCommande;
		this.prixTotal = prixTotal;
		this.idUser = idUser;
		this.idCommande = idCommande;
	}
	//Minimum
	public Commande(double prixTotal, int idUser, int idCommande) {
		super();
		this.prixTotal = prixTotal;
		this.idUser = idUser;
		this.idCommande = idCommande;
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
