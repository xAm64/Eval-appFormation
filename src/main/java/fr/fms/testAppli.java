package fr.fms;

import fr.fms.dao.FormationDao;
import fr.fms.entities.Formation;

public class testAppli {

	public static void main(String[] args) {
		Formation javaScript = new Formation("JavaScript", 2175.95, "Apprenner a maitriser JavaScript un lanagage web dynamique", "Présentiel 2jours par semaine");
		FormationDao fDao = new FormationDao();
		fDao.create(javaScript);
	}

}
