package model;

import java.sql.*;
import java.util.*;

public class BBDDUsuaris {
	static ArrayList<Object[]> llistaUsuaris = new ArrayList<Object[]>();
	
	public static void insertar(String nom, String cont) {
		String sentenciaSql = "INSERT INTO usuari(nom, contrasenya) VALUES(?,?)";
		PreparedStatement sentencia = null;
		
		try {
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			sentencia.setString(1, nom);
			sentencia.setString(2, cont);
			sentencia.executeUpdate();
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			if(sentencia != null) {
				try {
					sentencia.close();
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
			}
		}
	}
	
	public static boolean comprobar(String n, String c) {
		boolean a = false;
		String sentenciaSql = "SELECT nom, contrasenya FROM usuari WHERE nom = ? and contrasenya = ?";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;
		
		try {
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			sentencia.setString(1, n);
			sentencia.setString(2, c);
			resultat = sentencia.executeQuery();
			
			while(resultat.next()) {
				if(resultat.getObject(1).equals(n) && resultat.getObject(2).equals(c)) {
					return true;
				}
			}
		} catch(SQLException sqle) {
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
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			resultat = sentencia.executeQuery();
			
			while(resultat.next()) {
				Object[] a = new Object[2];
				for(int i = 0; i < a.length; i++) {
					a[i] = resultat.getObject(i + 1);
				}
				llistaUsuaris.add(a);
			}
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			if(sentencia != null) 
				try {
					sentencia.close();
					resultat.close();
				} catch(SQLException sqle) {
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
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			sentencia.setString(1, n);
			sentencia.setString(2, c);
			resultat = sentencia.executeQuery();
			
			while(resultat.next()) {
				i = (int) resultat.getObject(1);
			}
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			if(sentencia != null) 
				try {
					sentencia.close();
					resultat.close();
				} catch(SQLException sqle) {
					sqle.printStackTrace();
				}
		}
		return i;
	}
	
	public static Object[] usuari(int idUsuari) {
		Object[] a = new Object[2];
		
		String sentenciaSql = "SELECT nom FROM usuari WHERE id_usuari = ?";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;
		
		try {
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			sentencia.setInt(1, idUsuari);
			
			resultat = sentencia.executeQuery();
			
			while(resultat.next()) {
				a[0] = idUsuari;
				a[1] = resultat.getObject(1);
			}
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			if(sentencia != null)
				try {
					sentencia.close();
					resultat.close();
				} catch(SQLException sqle) {
					sqle.printStackTrace();
				}
		}
		return a;
	}
	
	public static Object[] usuariComplet(int idUsuari) {
		Object[] a = new Object[4];
		String sentenciaSql = "SELECT * FROM usuari WHERE id_usuari = ?";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;
		
		try {
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			sentencia.setInt(1, idUsuari);
			
			resultat = sentencia.executeQuery();
			
			while(resultat.next()) {
				for(int i = 0; i < a.length; i++) {
					a[i] = resultat.getObject(i + 1);
				}
			}
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			if(sentencia != null)
				try {
					sentencia.close();
					resultat.close();
				} catch(SQLException sqle) {
					sqle.printStackTrace();
				}
		}
		return a;
	}
	
	public static void updateNom(String a, int idUsuari) {
		String sentenciaSql = "UPDATE usuari SET nom = ? WHERE id_usuari = ?";
		PreparedStatement sentencia = null;
		
		try {
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			sentencia.setString(1, a);
			sentencia.setInt(2, idUsuari);
			
			sentencia.execute();
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			if(sentencia != null)
				try {
					sentencia.close(); 
				} catch(SQLException sqle) {
					sqle.printStackTrace();
				}
		}
	}
	
	public static void updateContrasenya(String a, int idUsuari) {
		String sentenciaSql = "UPDATE usuari SET contrasenya = ? WHERE id_usuari = ?";
		PreparedStatement sentencia = null;
		
		try {
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			sentencia.setString(1, a);
			sentencia.setInt(1, idUsuari);
			
			sentencia.execute();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			if(sentencia != null) 
				try {
					sentencia.close();
				} catch(SQLException sqle) {
					sqle.printStackTrace();
				}
		}
	}
}
