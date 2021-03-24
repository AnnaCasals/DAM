/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
        
package model;
import java.sql.*;
import java.util.ArrayList;
import static model.BBDDConnexio.connexio;

/**
 *
 * @author alumno
 */
public class BBDDExtraescolars {
    public static ArrayList<String> mostrarExtraescolars() {
        ArrayList<String> extraescolars = new ArrayList<String>();
        BBDDConnexio.connectar();
        ResultSet res = null;
        
        try {
            PreparedStatement ps = connexio.prepareStatement("SELECT * FROM extraescolars");
            res = ps.executeQuery();
            while(res.next()) {
                extraescolars.add((String) res.getObject(1));
            } 
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }
        BBDDConnexio.desconnectar();
        return extraescolars;
    }
    
    public static void insertarExtraescolar(String a) {
        Connection connexio = BBDDConnexio.connectar();
        PreparedStatement ps = null;
        try {
            ps = connexio.prepareStatement("INSERT INTO extraescolars(nom) VALUES(?)");
            ps.setString(1, a);
            ps.execute();
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }
        BBDDConnexio.desconnectar();
    }
    
    public static void borrarExtraescolar(String a) {
        Connection connexio = BBDDConnexio.connectar();
        PreparedStatement ps = null;
        
        try {
            ps = connexio.prepareStatement("DELETE FROM extraescolars WHERE nom = ?");
            ps.setString(1, a);
            ps.execute();
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }
        BBDDConnexio.desconnectar();
    }
}
