package baseDeDades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Connexio {
	
	static Connection connexio = null;

	
	public static void connectar() {
		try {
			Class.forName("org.postgresql.Driver").newInstance();
			connexio = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mensajeria", "postgres", "administrador");
			
			/** Ara hi ha varios usuaris, "Anna", "usuari" i "postgres". Ens conectarem en l'usuari postgres, mirarem si pot fer login o no, si el tipus es "admin" entrarem en l'usuari "Anna",
			 * sino entrarem en l'usuari "usuari"
			 */
			
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		} catch (InstantiationException ie) {
			ie.printStackTrace();
		} catch (IllegalAccessException iae) {
			iae.printStackTrace();
		}
	}
	
	public static void desconnectar() {
		try {
			connexio.close();
			connexio = null;
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}
