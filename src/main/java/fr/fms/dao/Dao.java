package fr.fms.dao;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Logger;

import fr.fms.entities.Utilisateur;

public interface Dao<T> {
	public static Connection connection = BddConnect.getConnection();
	public static final Logger logger = Logger.getLogger(Dao.class.getName());
	public boolean create(T obj);	
	public T read(int id);		
	public boolean update(T obj);	
	public boolean delete(T obj);	
	public ArrayList<T> readAll();
}
