package fr.fms.dao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class CreateConfigFile {

	public static void main(String[] args) {
		try (OutputStream output = new FileOutputStream("files/config.properties")) {

            Properties prop = new Properties();
            prop.setProperty("db.driver.class", "org.mariadb.jdbc.Driver");
            prop.setProperty("db.url", "jdbc:mariadb://localhost:3306/Shop");
            prop.setProperty("db.login", "root");
            prop.setProperty("db.password", "fms2024");

            prop.store(output, null);

            System.out.println(prop);

        } catch (IOException io) {
            io.printStackTrace();
        }
	}

}
