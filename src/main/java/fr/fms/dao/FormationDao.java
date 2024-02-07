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
		String request = "INSERT INTO Formation (titre, prix, description, lieu) VALUES (?,?,?,?);";
		try (PreparedStatement ps = connection.prepareStatement(request)){
			ps.setString(1, obj.getTitre());
			ps.setDouble(2, obj.getPrix());
			ps.setString(3, obj.getDescription());
			ps.setString(4, obj.getLieu());
			if( ps.executeUpdate() == 1)	return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Formation read(int id) {
		try (Statement statement = connection.createStatement()){
			String request = "SELECT * FROM Formation where idFormation = "+id+";";
			ResultSet rs = statement.executeQuery(request);
			if (rs.next()) {
				return new Formation(rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5));
			}
		}catch (SQLException er) {
			er.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean update(Formation obj) {
		String request = "UPDATE Formation SET titre = ?, prix = ?, description = ?, lieu = ? WHERE idFormation = ?;";
		try (PreparedStatement ps = connection.prepareStatement(request)){
			ps.setString(1, obj.getTitre());
			ps.setDouble(2, obj.getPrix());
			ps.setString(3, obj.getDescription());
			ps.setString(4, obj.getLieu());
			ps.setInt(5, obj.getIdFormation());
			if( ps.executeUpdate() == 1)	return true;
		}catch (SQLException e) {
			e.printStackTrace();
		}
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
