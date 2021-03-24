package baseDeDades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BBDDTUsuaris {
	
	static ArrayList<Object[]> llistaUsuaris = new ArrayList<Object[]>();
	
	public static void insertar(String nom, String cont) {
		String sentenciaSql = "INSERT INTO usuari(nom, contrasenya) VALUES(?, ?)";
		PreparedStatement sentencia = null;
		
		try {
			sentencia = Connexio.connexio.prepareStatement(sentenciaSql);
			sentencia.setString(1, nom);
			sentencia.setString(2, cont);
			sentencia.executeUpdate();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			if ( sentencia != null)
				try {
					sentencia.close();
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
		}
	}
	
	public static boolean comprobar(String n, String c) {
		boolean a = false;
		String sentenciaSql = "SELECT nom, contrasenya FROM usuari WHERE nom = ? and contrasenya = ?";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;
		
		try {
			
			sentencia = Connexio.connexio.prepareStatement(sentenciaSql);
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
				try {
					sentencia.close();
					resultat.close();
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
		}
		return a;
	}
	
	
	public static ArrayList<Object[]> consultaUsuaris() {
		String sentenciaSql = "SELECT id_usuari, nom FROM usuari";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;
		
		try {
			sentencia = Connexio.connexio.prepareStatement(sentenciaSql);
			resultat = sentencia.executeQuery();
			while(resultat.next()) {
				Object[] a = new Object[2]; 
				for(int i = 0; i < a.length; i++) {
					a[i] = resultat.getObject(i + 1);
				}
				llistaUsuaris.add(a);
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			if(sentencia != null)
				try {
					sentencia.close();
					resultat.close();
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
		}
		return llistaUsuaris;
	}
	
	public static int consultaIdUsuari(String n, String c) {
		int i = -1;
		String sentenciaSql = "SELECT id_usuari FROM usuari WHERE nom = ? and contrasenya = ?";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;
		
		try {
			sentencia = Connexio.connexio.prepareStatement(sentenciaSql);
			sentencia.setString(1, n);
			sentencia.setString(2, c);
			resultat = sentencia.executeQuery();
			while(resultat.next()) {
				i = (int) resultat.getObject(1);
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			if(sentencia != null) 
				try {
					sentencia.close();
					resultat.close();
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
		}
		return i;
	}
}
