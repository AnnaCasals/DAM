package model;

import java.sql.*;
import java.util.*;

public class BBDDEnvia {
	
	public static ArrayList<Integer> consultaMissatges(int idConversa) {
		ArrayList<Integer> llistaMissatges = new ArrayList<Integer>();
		
		String sentenciaSql = "SELECT id_msj FROM envia WHERE id_conversa = ?";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;
		
		try {
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			sentencia.setInt(1, idConversa);
			resultat = sentencia.executeQuery();
			
			while(resultat.next()) {
				int a = (int)resultat.getObject(1);
				llistaMissatges.add(a);
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
		return llistaMissatges;
	}
	
	public static int idUsuariDeMissatge(int idMsj) {
		int id = -1;
		
		String sentenciaSql = "SELECT id_usuari FROM envia WHERE id_msj = ?";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;
		
		try {
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			sentencia.setInt(1, idMsj);
			resultat = sentencia.executeQuery();
			
			while(resultat.next()) {
				id = (int) resultat.getObject(1);
			}
		} catch (SQLException sqle) {
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
		return id;
	}
}
