package baseDeDades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Connexio {
	static Connection conexion = null;
	static ArrayList<Object[]> llista = new ArrayList<Object[]>();
	 
	
	public static void connectar() {
		
		try {
			Class.forName("org.postgresql.Driver").newInstance();
			conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} catch (InstantiationException ie) {
			ie.printStackTrace();
		} catch (IllegalAccessException iae) {
			iae.printStackTrace();
		}
	}

	public static void desconnectar() {
		try {
			conexion.close();
			conexion = null;
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
	
	public static void insertar(String nom, String cont, String niv) {
		String sentenciaSql = "INSERT INTO usuaris(nom, contrasenya, nivell) VALUES(?, ?, ?)";
		PreparedStatement sentencia = null;
		
		try {
			sentencia = conexion.prepareStatement(sentenciaSql);
			sentencia.setString(1, nom);
			sentencia.setString(2, cont);
			sentencia.setString(3, niv);
			sentencia.executeUpdate();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			if(sentencia != null)
				try {
					sentencia.close();
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
		}
	}
	
	public static boolean llegir(String n, String c) {
		boolean a = false;
		String sentenciaSql = "SELECT * FROM usuaris WHERE nom = ? and contrasenya = ?";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;
		try {
			sentencia = conexion.prepareStatement(sentenciaSql);
			sentencia.setString(1, n);
			sentencia.setString(2, c);
			resultat = sentencia.executeQuery();
			while(resultat.next()) {
				if(resultat.getObject(1).equals(n) && resultat.getObject(2).equals(c)) {
					return true;
				}
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			if(sentencia != null)
				try  {
					sentencia.close();
					resultat.close();
				} catch(SQLException sqle) {
					sqle.printStackTrace();
				}
		}
		return a;
	}
	
	public static ArrayList consulta() {
		String sentenciaSql = "SELECT * FROM productes";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;

		try {
			sentencia = conexion.prepareStatement(sentenciaSql);
			resultat = sentencia.executeQuery();
			while(resultat.next()) {
				Object[] a = new Object[4];
				for(int i = 0; i < a.length; i++) {
					a[i] = resultat.getObject(i+1);
				}
				llista.add(a);
					
			}

		} catch(SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			if(sentencia != null)
				try  {
					sentencia.close();
					resultat.close();
				} catch(SQLException sqle) {
					sqle.printStackTrace();
				}
		}
		return llista;
	}
}
