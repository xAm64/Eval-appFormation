package fr.fms.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.StringTokenizer;

import fr.fms.entities.Utilisateur;

public class UtilisateurDao implements Dao<Utilisateur> {

	//Les commentaires sont dans FormationDao, c'est la même chose dans un autre contexte.
	@Override
	public boolean create(Utilisateur obj) {
		String request = "INSERT INTO Utilisateur (nom, email) VALUES (?,?);";
		try (PreparedStatement ps = connection.prepareStatement(request)){
			ps.setString(1, obj.getNom());
			ps.setString(2, obj.getEmail());
			if( ps.executeUpdate() == 1) return true;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Utilisateur read(int id) {
		try(Statement statement = connection.createStatement()){
			String request = "SELECT * FROM Utilisateur WHERE idUser = "+id+";";
			ResultSet rs = statement.executeQuery(request);
			if (rs.next()) {
				return new Utilisateur(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean update(Utilisateur obj) {
		String request = "UPDATE Utilisateur SET nom = ?, email = ? WHERE idUser = ?;";
		try (PreparedStatement ps = connection.prepareStatement(request)){
			ps.setString(1, obj.getNom());
			ps.setString(2, obj.getEmail());
			ps.setInt(3, obj.getIdUser());
			if( ps.executeUpdate() == 1) return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return false;
	}

	@Override
	public boolean delete(Utilisateur obj) {
		try (Statement statement = connection.createStatement()){
			String request = "DELETE FROM Utilisateur WHERE idUser = "+obj.getIdUser()+";";
			statement.execute(request);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<Utilisateur> readAll() {
		ArrayList<Utilisateur> users = new ArrayList<Utilisateur>();
		String request = "SELECT * FROM Utilisateur;";
		try (Statement statement = connection.createStatement()){
			try (ResultSet rs = statement.executeQuery(request)){
				while(rs.next()) {
					int idUser = rs.getInt(1);
					String nom = rs.getString(2);
					String email = rs.getString(3);
					users.add(new Utilisateur(idUser, nom,  email));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

}
