package fr.fms;

import java.sql.ClientInfoStatus;
import java.util.Scanner;
import fr.fms.entities.Utilisateur;

public class CreateClient {

	public Utilisateur recupCoordonates(Scanner scn) {
		boolean ok;
		do {
			ok = false;
			Utilisateur newClient = new Utilisateur(recupWord("Veuillez saisir votre nom", scn), recupWord("Veuillez saisir votre email", scn));
			System.out.println("Votre nom: "+newClient.getNom()+" et votre email: "+newClient.getEmail()+". Est ce correct ? (oui/non)");
			String iAgree = scn.next();
			iAgree = iAgree.toLowerCase();
			if (iAgree.equals("oui") || iAgree.equals("o")) {
				ok = true;
				return newClient;
			}
		} while (!ok);
		return null;
	}
	
	public String recupWord(String instruction, Scanner scn) {
		boolean ok = false;
		while (!ok) {
			System.out.println(instruction);
			String word = scn.next();
			System.out.println(word+" est ce correct pour vous ? (oui/non)");
			String iAgree = scn.next();
			iAgree = iAgree.toLowerCase();
			if (iAgree.equals("oui") || iAgree.equals("o")) {
				ok = true;
				return word;
			}
		}
		return null;
	}

}
