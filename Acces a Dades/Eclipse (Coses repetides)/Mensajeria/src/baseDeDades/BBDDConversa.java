package baseDeDades;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BBDDConversa {
	
	public static String TitolConversa(int id) {
		String t = "";
		String sentenciaSql = "SELECT titol FROM conversa WHERE id_conversa = ?";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;
		
		try {
			sentencia = Connexio.connexio.prepareStatement(sentenciaSql);
			sentencia.setInt(1, id);
			resultat = sentencia.executeQuery();
			while(resultat.next()) {
				t = (String) resultat.getObject(1);
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
		return t;
	}
	
	public static int numUsuaris(int id) {
		int i = 0;
		String sentenciaSql = "SELECT nusuaris FROM conversa WHERE id_conversa = ?";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;
		
		try {
			sentencia = Connexio.connexio.prepareStatement(sentenciaSql);
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
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
		}
		return i;
	}
	
	public static ArrayList<Object[]> conversesCompletes(Integer id) {
		ArrayList<Object[]> conversa = new ArrayList<Object[]>();
		String sentenciaSql = "SELECT * FROM conversa WHERE id_conversa = ?";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;
		
		try {
			sentencia = Connexio.connexio.prepareStatement(sentenciaSql);
			sentencia.setInt(1, id);
			resultat = sentencia.executeQuery();
			Object[] z = new Object[5];
			while(resultat.next()) {
				for(int i = 0; i < z.length; i++) {
					z[i] = resultat.getObject(i + 1);
				}
				conversa.add(z);
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
	
}
