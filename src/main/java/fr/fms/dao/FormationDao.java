package fr.fms.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

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
		ArrayList<Formation> formations = new ArrayList<Formation>();
		String requestSql = "SELECT * FROM Formation;";
		try (Statement statement = connection.createStatement()){
			try (ResultSet resultSet = statement.executeQuery(requestSql)){
				while (resultSet.next()) {
					int idFormation = resultSet.getInt(1);
					String titre = resultSet.getString(2);
					Double prix = resultSet.getDouble(3);
					String description = resultSet.getString(4);
					String lieu = resultSet.getString(5);
					formations.add(new Formation(idFormation, titre, prix , description, lieu));
				}
			}
		} catch (SQLException er) {
			er.printStackTrace();
		}
		return formations;
	}

}
