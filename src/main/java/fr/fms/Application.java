package fr.fms;

import java.util.ArrayList;
import java.util.Scanner;
import fr.fms.dao.*;
import fr.fms.entities.*;

public class Application {
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Bienvenue dans l'application: Vente de formations");
		String notice = "que voulez-vous faire ?\n"+
				"0: Sortir\n"+
				"1: consulter les formations\n";
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
				readOneFormation();
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
	
	//lire toutes les formations
	public static void readAllFormations() {
		FormationDao formationDao = new FormationDao();
		ArrayList<Formation> formations = formationDao.readAll();
		for (Formation f: formations){
			System.out.println("Id de la formation: "+f.getIdFormation()+", titre: "+f.getTitre()+", prix: "+f.getPrix()+", Description: "+f.getDescription()+", Lieu: "+f.getLieu()+".");
		}
	}
	
	public static void readOneFormation() {
		System.out.println("Faire une formation");
	}
}
