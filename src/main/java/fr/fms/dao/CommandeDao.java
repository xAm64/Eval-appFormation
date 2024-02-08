package fr.fms.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.management.AttributeList;

import fr.fms.entities.Commande;

public class CommandeDao implements Dao<Commande> {

	@Override
	public boolean create(Commande obj) {
		String request = "INSERT INTO Commande (prixTotal, idFormation, idUser) VALUES (?,?,?);";
		try (PreparedStatement ps = connection.prepareStatement(request)){
			ps.setDouble(1, obj.getPrixTotal());
			ps.setInt(2, obj.getIdFormation());
			ps.setInt(3, obj.getIdUser());
			if( ps.executeUpdate() == 1) return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Commande read(int id) {
		try (Statement statement = connection.createStatement()){
			String request = "SELECT * FROM Commande \r\n"
					+ "JOIN Formation ON Commande.idFormation = Formation.idFormation \r\n"
					+ "JOIN Utilisateur ON Commande.idUser = Utilisateur.idUser \r\n"
					+ "WHERE idCommande = "+id+";";
			ResultSet rs = statement.executeQuery(request);
			if (rs.next()) {
				return new Commande(rs.getDouble(2), rs.getInt(3), rs.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean update(Commande obj) {
		String request = "UPDATE Commande SET prixTotal = ?, idFormation = ?, idUser  = ? WHERE idCommande = ?;";
		try (PreparedStatement ps = connection.prepareStatement(request)){
			ps.setDouble(1, obj.getPrixTotal());
			ps.setInt(2, obj.getIdFormation());
			ps.setInt(3, obj.getIdUser());
			ps.setInt(4, obj.getIdCommande());
			if (ps.executeUpdate() == 1) return true;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Commande obj) {
		try (Statement statement = connection.createStatement()){
			String request = "DELETE FROM Commande WHERE IdCommande = "+obj.getIdCommande()+";";
			statement.executeUpdate(request);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<Commande> readAll() {
		ArrayList<Commande> commandes = new ArrayList<Commande>();
		String request = "SELECT * FROM Commande \r\n"
				+ "JOIN Formation ON Commande.idFormation = Formation.idFormation \r\n"
				+ "JOIN Utilisateur ON Commande.idUser = Utilisateur.idUser ;";
		try (Statement statement = connection.createStatement()){
			try (ResultSet rs = statement.executeQuery(request)){
				while (rs.next()) {
					int idCommande = rs.getInt(1);
					double prixTotal = rs.getDouble(2);
					int idFormation = rs.getInt(3);
					int idUser = rs.getInt(4);
					commandes.add(new Commande(idCommande,  prixTotal,  idFormation, idUser));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
