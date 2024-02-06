package fr.fms.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import fr.fms.entities.Formation;

public class FormationDao implements Dao<Formation>{

	@Override
	public boolean create(Formation obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Formation read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Formation obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Formation obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Formation> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
