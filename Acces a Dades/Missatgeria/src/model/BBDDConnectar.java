package model;

import java.sql.*;
import java.util.*;

public class BBDDConnectar {
	static Connection connexio = null;
	
	public static void connectar() {
		try {
			Class.forName("org.postgresql.Driver").newInstance();
			connexio = DriverManager.getConnection("jdbc:postgresql://localhost:5432/missatgeria", "postgres", "postgres");
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		} catch(InstantiationException ie) {
			ie.printStackTrace();
		} catch(IllegalAccessException iae) {
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
