package baseDeDades;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BBDDPertany {
	static ArrayList<Integer> llistaConverses = new ArrayList<Integer>();
	
	public static ArrayList consultaConverses(int id) {
		String sentenciaSql = "SELECT id_conversa FROM pertany WHERE id_usuari = ?";
		PreparedStatement sentencia = null;
		ResultSet resultat = null;
		
		try {
			sentencia = Connexio.connexio.prepareStatement(sentenciaSql);
			sentencia.setInt(1, id);
			resultat = sentencia.executeQuery();
			while(resultat.next()) {
				int a = (int) resultat.getObject(1); 
				llistaConverses.add(a);
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
		return llistaConverses;
	}
}
