package fr.fms;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Scanner;

import fr.fms.dao.UtilisateurDao;
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
				ArrayList<Utilisateur> users = new ArrayList<Utilisateur>();
				UtilisateurDao ud = new UtilisateurDao();
				users = ud.readAll();
				int idUser = users.size()+1;
				Utilisateur registerClient = new Utilisateur(idUser, newClient.getNom(), newClient.getEmail());
				ok = true;
				return registerClient;
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
