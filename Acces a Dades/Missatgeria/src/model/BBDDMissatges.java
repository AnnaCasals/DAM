package model;

import java.sql.*;

public class BBDDMissatges {
	
	public static Object[] missatgesComplets(Integer id) {
		Object[] missatge = new Object[4];
		String sentenciaSql = "SELECT * FROM missatge WHERE id_msj = ?";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;
		
		try {
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			sentencia.setInt(1, id);
			resultat = sentencia.executeQuery();
			
			while(resultat.next()) {
				for(int i = 0;  i < missatge.length; i++) {
					missatge[i] = resultat.getObject(i + 1);
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
		return missatge;
	}
	
	public static void borrarMissatge(int idMissatge) {
		String sentenciaSql = "DELETE FROM missatge WHERE id_msj = ?";
		PreparedStatement sentencia = null;
		
		try {
			sentencia = BBDDConnectar.connexio.prepareStatement(sentenciaSql);
			sentencia.setInt(1, idMissatge);
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
	
	public static void insertarMissatge(String text, int idConversa, int idUsuari) {
		String sentenciaSqlMissatge = "INSERT INTO missatge(txt, horam, datam) VALUES (?, '10:20', '10/10/2019')";
		String sentenciaSqlEnvia = "INSERT INTO envia(id_usuari, id_msj, id_conversa) VALUES (?,?,?)";
		
		PreparedStatement sentencia = null;
		PreparedStatement sentencia2 = null;
		ResultSet resultat = null;		
		Connection con = null;
		
		
		int idMissatge = 0;
		try {
			con = BBDDConnectar.connexio;
			con.setAutoCommit(false);

			sentencia = con.prepareStatement(sentenciaSqlMissatge, Statement.RETURN_GENERATED_KEYS);
			sentencia.setString(1, text);
			
			int a = sentencia.executeUpdate();
			if(a > 0) {
				resultat = sentencia.getGeneratedKeys();
				
				while(resultat.next()) {
					idMissatge = resultat.getInt(1);
					
					sentencia2 = con.prepareStatement(sentenciaSqlEnvia);
					
					sentencia2.setInt(1, idUsuari);
					sentencia2.setInt(2, idMissatge);
					sentencia2.setInt(3, idConversa);
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
	}
}
