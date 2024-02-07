package fr.fms;

import fr.fms.dao.FormationDao;
import fr.fms.dao.UtilisateurDao;
import fr.fms.entities.Formation;
import fr.fms.entities.Utilisateur;

public class testAppli {

	public static void main(String[] args) {
		//formation
		//FormationDao fDao = new FormationDao();
		//Crud test
		//create
		/*
		Formation javaScript = new Formation("JavaScript", 2175.95, "Apprenner a maitriser JavaScript un lanagage web dynamique", "Présentiel 2jours par semaine");
		fDao.create(javaScript);
		*/
		//Test OK
		
		//Update
		/*
		Formation javaScript = new Formation(5, "JavaScript", 2175.95, "Apprenner a maitriser JavaScript un lanagage web dynamique, offrant beaucoup de possibilités", "Présentiel 2jours par semaines");
		fDao.update(javaScript);
		*/
		//test OK
		
		//delete
		/*
		Formation javaScript = new Formation(5, "JavaScript", 2175.95, "Apprenner a maitriser JavaScript un lanagage web dynamique, offrant beaucoup de possibilités", "Présentiel 2jours par semaines");
		fDao.delete(javaScript);
		*/
		//Test OK
		
		//Utilisateur
		UtilisateurDao uDao = new UtilisateurDao();
		//create
		/*
		Utilisateur mohamed = new Utilisateur("Mohamed", "mohamed@email.com");
		uDao.create(mohamed);
		*/
		//test OK
		
		//read
		/*
		Utilisateur mohamed = uDao.read(1);
		System.out.println("Nom: "+mohamed.getNom()+" email: "+mohamed.getEmail()+".");
		*/
		//test OK
		
		//update
		/*
		Utilisateur mohamed = new Utilisateur(1, "Mohamed", "mohamed@gmail.com");
		uDao.update(mohamed);
		*/
		//test OK
	}
}
