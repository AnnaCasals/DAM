package model;

import java.sql.*;
import java.util.*;

public class BBDDConversa {
	
	public static String TitolConversa(int id) {
		String t = "";
		String sentenciaSql = "SELECT titol FROM conversa WHERE id_conversa = ?";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;
		
		try {
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			sentencia.setInt(1, id);
			resultat = sentencia.executeQuery();
			
			while(resultat.next()) {
				t = (String) resultat.getObject(1);
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
		return t;
	}
	
	public static int numUsuaris(int id) {
		int i = 0;
		String sentenciaSql = "SELECT nusuaris FROM conversa WHERE id_conversa = ?";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;
		
		try {
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			sentencia.setInt(1, id);
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
	
	public static Object[] conversaCompleta(Integer id) {
		Object[] conversa = new Object[5];
		String sentenciaSql = "SELECT * FROM conversa WHERE id_conversa = ?";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;
		
		try {
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			sentencia.setInt(1, id);
			resultat = sentencia.executeQuery();
			
			while(resultat.next()) {
				for(int i = 0; i < conversa.length; i++) {
					conversa[i] = resultat.getObject(i + 1);
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
		return conversa;
	}
	
	public static int insertarConversa(String titol, int idUsuari) {
		String sentenciaSql = "INSERT INTO conversa(horac, datac, titol) VALUES ('10:10', '10/10/2019', ?)";
		String sentenciaSql2 = "INSERT INTO pertany(id_usuari, id_conversa) VALUES(?, ?)";
		
		PreparedStatement sentencia = null;
		PreparedStatement sentencia2 = null;
		ResultSet resultat = null;
		Connection con = null;
		
		int idConversa = 0;
		try {
			con = BBDDConnectar.connexio;
			con.setAutoCommit(false);
			
			sentencia = con.prepareStatement(sentenciaSql, Statement.RETURN_GENERATED_KEYS);
			sentencia.setString(1, titol);
			
			int a = sentencia.executeUpdate();
			if(a > 0) {
				resultat = sentencia.getGeneratedKeys();
				
				while(resultat.next()) {
					idConversa = resultat.getInt(1);
					
					sentencia2 = con.prepareStatement(sentenciaSql2);
					sentencia2.setInt(1, idUsuari);
					sentencia2.setInt(2, idConversa);
					System.out.println();
					sentencia2.executeUpdate();
				}
			} else {
				con.rollback();
			}
			con.commit();
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			if(sentencia != null) 
				try {
					sentencia.close();
					sentencia2.close();
					resultat.close();
				} catch(SQLException sqle) {
					sqle.printStackTrace();
				}
		}
		return idConversa;
	}
	
	public static void updateTitol(int idConversa, String titol) {
		PreparedStatement sentencia = null;
		String sentenciaSql = "UPDATE conversa SET titol = ? WHERE id_conversa = ?";
		
		try {
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			sentencia.setString(1, titol);
			sentencia.setInt(2, idConversa);
			sentencia.execute();
		} catch(SQLException sqle) {
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
}
