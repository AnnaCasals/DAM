package model;

import java.sql.*;
import java.util.*;

public class BBDDPertany {
	
	public static ArrayList<Integer> consultaConverses(int idUsuari) {
		ArrayList<Integer> llistaConverses = new ArrayList<Integer>();
		
		String sentenciaSql = "SELECT id_conversa FROM pertany WHERE id_usuari = ?";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;
		
		try {
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			sentencia.setInt(1, idUsuari);
			resultat = sentencia.executeQuery();
			
			while(resultat.next()) {
				int a = (int) resultat.getObject(1);
				llistaConverses.add(a);
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
		return llistaConverses;
	}
	
	public static void eixirConversa(int idUsuari, int idConversa) {
		String sentenciaSql = "DELETE FROM pertany WHERE id_usuari = ? AND id_conversa = ?";
		PreparedStatement sentencia = null;
		
		try {
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			sentencia.setInt(1, idUsuari);
			sentencia.setInt(2, idConversa);
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
	
	public static ArrayList<Integer> usuarisConversa(int idConversa) {
		ArrayList<Integer> llistaUsuaris = new ArrayList<Integer>();
		
		String sentenciaSql = "SELECT id_usuari FROM pertany WHERE id_conversa = ?";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;
		
		try {
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			sentencia.setInt(1, idConversa);
			
			resultat = sentencia.executeQuery();
			
			while(resultat.next()) {
				int a = (int)resultat.getObject(1);
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
	
	public static void insertarUsuariConversa(int idUsuari, int idConversa) {
		String sentenciaSql = "INSERT INTO pertany(id_usuari, id_conversa) VALUES (?,?)";
		PreparedStatement sentencia = null;
		
		try {
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			sentencia.setInt(1, idUsuari);
			sentencia.setInt(2, idConversa);
			
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
}
