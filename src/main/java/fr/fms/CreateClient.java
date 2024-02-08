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
	
	public Utilisateur foundUser(Utilisateur user) {
		UtilisateurDao ud = new UtilisateurDao();
		ArrayList<Utilisateur> users = ud.readAll();
		try {
			for (int i = (users.size()-1); i < 0; i--) {
				Utilisateur x = users.get(i);
				if (x.getEmail() == user.getEmail()) {
					user.setIdUser(x.getIdUser());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

}
