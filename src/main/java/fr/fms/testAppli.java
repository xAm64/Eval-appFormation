package fr.fms;

import fr.fms.dao.FormationDao;
import fr.fms.entities.Formation;

public class testAppli {

	public static void main(String[] args) {
		FormationDao fDao = new FormationDao();
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
	}
}
