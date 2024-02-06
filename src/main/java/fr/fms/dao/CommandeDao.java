package fr.fms.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import fr.fms.entities.Commande;

public class CommandeDao implements Dao<Commande> {

	@Override
	public boolean create(Commande obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Commande read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Commande obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Commande obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Commande> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
