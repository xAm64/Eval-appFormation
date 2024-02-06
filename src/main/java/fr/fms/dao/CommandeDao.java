package fr.fms.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import fr.fms.entities.Commande;

public class CommandeDao implements Dao<Commande> {
	
	//Create
	@Override
	public boolean create(Commande obj) {
		/*
		String str = ""; //requête SQL
		try (PreparedStatement ps = connection.prepareStatement(str)){
			//coder l'anti injection
		} catch (SQLException e) {
			//coder l'exception
			 */
		return false;
	}
	
	//read
	@Override
	public Commande read(int id) {
		/*
		try (Statement statement = connection.createStatement()){
			String str = "";									
		} catch (SQLException e) {
			
		} 	
		*/
		return null;
	}

	//update
	@Override
	public boolean update(Article obj) {
		/*
		String str = "";
		try (PreparedStatement ps = connection.prepareStatement(str)){				
			if( ps.executeUpdate() == 1)	return true;
		} catch (SQLException e) {
			logger.severe("pb sql sur la mise à jour d'un article " + e.getMessage());
		} 
		*/
		return false;
	}

	//delete
	@Override
	public boolean delete(Article obj) {
		/*
		try (Statement statement = connection.createStatement()){
			String str = "";									
			statement.executeUpdate(str);		
			return true;
		} catch (SQLException e) {
			message
		} 	
		*/
		return false;
	}
	
	//read all
	@Override
	public ArrayList<Article> readAll() {
		/*
		ArrayList<Commande>  commandes = new ArrayList<Commande>();
		String strSql = "SELECT * FROM T_Articles";		
		try(Statement statement = connection.createStatement()){
			try(ResultSet resultSet = statement.executeQuery(strSql)){ 			
				while(resultSet.next()) {
					int rsId = resultSet.getInt(1);	
					String rsDescription = resultSet.getString(2);
					String rsBrand = resultSet.getString(3);
					double rsPrice = resultSet.getDouble(4);		
					articles.add((new Article(rsId,rsDescription,rsBrand,rsPrice)));						
				}	
			}
		} catch (SQLException e) {
			logger.severe("pb sql sur revoi de tous articles " + e.getMessage());
		}	
		*/
		return null;
	}
}
