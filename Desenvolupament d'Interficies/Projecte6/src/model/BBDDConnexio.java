/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.io.*;

/**
 *
 * @author alumno
 */

public class BBDDConnexio {
    public static Connection connexio = null;
    
    public static Connection connectar() {
        try {
            Class.forName("org.sqlite.JDBC");
            connexio = DriverManager.getConnection("jdbc:sqlite:Alumnos.db");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al registrar el driver de SQLite: " + ex);
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }
        return connexio;
    }
    
    public static void desconnectar() {
        try {
            connexio.close();
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}