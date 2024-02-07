package fr.fms;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.omg.CORBA.PUBLIC_MEMBER;

import fr.fms.Application;
import fr.fms.entities.Formation;
import fr.fms.entities.Utilisateur;
import fr.fms.entities.*;

public class CreateCommande {
	private Formation formation;
	private Utilisateur user;

	public CreateCommande(Formation formation, Utilisateur client) {
		this.formation = formation;
		this.user = client;
	}

	public Commande createCommande(Formation formation, Utilisateur utilisateur) {
		double prixTotal = formation.getPrix();
		int idFormation = formation.getIdFormation();
		int idUser = utilisateur.getIdUser();
		Commande commande = new Commande(prixTotal, idFormation, idUser);
		return commande;
	}
}
