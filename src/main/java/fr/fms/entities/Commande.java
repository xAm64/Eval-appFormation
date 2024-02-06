package fr.fms.entities;

import java.util.Date;

public class Commande {
	
	private int idCommande;
	private double prixTotal;
	
	//Constructeurs
	//Complet
	public Commande(int idCommande, double prixTotal) {
		super();
		this.idCommande = idCommande;
		this.prixTotal = prixTotal;
	}
	//Minimum
	public Commande(double prixTotal) {
		super();
		this.prixTotal = prixTotal;
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
	
}
