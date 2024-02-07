package fr.fms;

import java.util.ArrayList;
import java.util.Scanner;
import fr.fms.dao.*;
import fr.fms.entities.*;
import fr.fms.CreateClient;

public class Application {
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Bienvenue dans l'application: Vente de formations");
		String notice = "que voulez-vous faire ?\n"+
				"0: Sortir\n"+
				"1: Consulter les formations\n"+
				"2: Afficher une formation";
		int choise = 0;
		do {
			choise = writeNumber(notice, scn);
			switch (choise) {
			case 0:
				System.out.println("Sortie du programme");
				break;
			case 1:
				readAllFormations();
				break;
			case 2:
				readOneFormation(scn);
				break;
			default:
				System.out.println("Cette option n'existe pas");
				break;
			}
		} while (choise != 0);
		System.out.println("À bientôt");
	}
	
	//Méthodes
	//récupère un nombre entier
	public static int writeNumber(String instruction, Scanner scn) {
		boolean reset = true;
		int x = 0;
		while (reset) {
			System.out.println(instruction);
			try {
				x = scn.nextInt();
				return x;
			}catch (Exception e) {
				System.out.println("ceci n'est pas un chiffre: "+e);
				scn.next();
			}
		};
		return 0;
	}
	
	//Choix 1: voir toutes les formations.
	public static void readAllFormations() {
		FormationDao formationDao = new FormationDao();
		try {
			ArrayList<Formation> formations = formationDao.readAll();
			for (Formation f: formations){
				System.out.println("Id de la formation: "+f.getIdFormation()+", titre: "+f.getTitre()+", prix: "+f.getPrix()+", Description: "+f.getDescription()+", Lieu: "+f.getLieu()+".");
			}
		} catch (NullPointerException e) {
			System.out.println("Cette formation n'existe pas");
		}
		
	}
	//Choix2: lire une formation.
	public static void readOneFormation(Scanner scn) {
		//affiche les instructions au client
		String instruction = "Saisir l'ID de la formation à afficher";
		//récupère l'id
		int idFormation = writeNumber(instruction, scn);
		//créer uen formation vierge
		FormationDao formationDao = new FormationDao();
		//récupère les informations de la formation demandée.
		Formation formation = formationDao.read(idFormation);
		//affiche la formation demandée.
		System.out.println("La formation numéro: "+formation.getIdFormation()+" est "+formation.getTitre()+" coûte "+formation.getPrix()+". Sa description est: "+formation.getDescription()+". Son lieu est: "+formation.getLieu()+".");
	}
	
	public static void commandFormation(Scanner scn) {
		//récupère la formation demandé à l'aide de la méthode 2.
		String instruction = "Saisir l'ID de la formation que vous souhaitez commander";
		int idFormation = writeNumber(instruction, scn);
		FormationDao formationDao = new FormationDao();
		Formation formationCommande = formationDao.read(idFormation);
		//récupére la class pour créer un utilisateur
		CreateClient newClient = new CreateClient();
		//récupére un nouvel utilisateur.
		Utilisateur newUser = newClient.recupCoordonates(scn);
		UtilisateurDao newUserDao = new UtilisateurDao();
		newUserDao.create(newUser);
		//créer la commande
	}
}
