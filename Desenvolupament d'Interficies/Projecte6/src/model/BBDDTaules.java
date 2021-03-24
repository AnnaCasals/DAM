/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class BBDDTaules {
    public static void borrarElementsTaula() {
        Connection connexio = BBDDConnexio.connectar();
        try {
            Statement pes = connexio.createStatement();
            PreparedStatement ps = connexio.prepareStatement("DELETE FROM opcions");
            ps.execute();
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }
        BBDDConnexio.desconnectar();
    }
    
    public static void sort1Opcio(int i, String opcio, String ext) {
        Connection connexio = BBDDConnexio.connectar();
        ResultSet res;
        try {
            PreparedStatement ps = connexio.prepareStatement("SELECT nom, curs FROM opcions WHERE p_opcio = ? ORDER BY RANDOM() LIMIT ?");
            ps.setString(1, opcio);
            ps.setInt(2, i);
            res = ps.executeQuery();
            while(res.next()) {
                ps = connexio.prepareStatement("INSERT INTO " + ext + "(nom, curs) VALUES(?, ?)");
                ps.setString(1, (String) res.getObject(1));
                ps.setString(2, (String) res.getObject(2));
                ps.execute();
                
                
                ps = connexio.prepareStatement("DELETE FROM opcions WHERE nom = ?");
                ps.setString(1, (String) res.getObject(1));
                ps.execute();
            }
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }
        BBDDConnexio.desconnectar();
    }
    
     public static void sort2Opcio(int i, String opcio, String ext) {
        Connection connexio = BBDDConnexio.connectar();
        ResultSet res;
        try {
            PreparedStatement ps = connexio.prepareStatement("SELECT nom, curs FROM opcions WHERE s_opcio = ? ORDER BY RAND() LIMIT ?");
            ps.setString(1, opcio);
            ps.setInt(2, i);
            res = ps.executeQuery();
            while(res.next()) {
                ps = connexio.prepareStatement("INSERT INTO " + ext + "(nom, curs) VALUES(?, ?)");
                ps.setString(1, (String) res.getObject(1));
                ps.setString(2, (String) res.getObject(2));
                ps.execute();
                
                ps = connexio.prepareStatement("DELETE FROM opcions WHERE nom = ?");
                ps.setString(1, (String) res.getObject(1));
                ps.execute();
            }
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }
        BBDDConnexio.desconnectar();
    }
    
    public static void sort3Opcio(int i, String opcio, String ext) {
        Connection connexio = BBDDConnexio.connectar();
        ResultSet res;
        try {
            PreparedStatement ps = connexio.prepareStatement("SELECT nom, curs FROM opcions WHERE t_opcio = ? ORDER BY RAND() LIMIT ?");
            ps.setString(1, opcio);
            ps.setInt(2, i);
            res = ps.executeQuery();
            while(res.next()) {
                ps = connexio.prepareStatement("INSERT INTO " + ext + "(nom, curs) VALUES(?, ?)");
                ps.setString(1, (String) res.getObject(1));
                ps.setString(2, (String) res.getObject(2));
                ps.execute();
                
                
                ps = connexio.prepareStatement("DELETE FROM opcions WHERE nom = ?");
                ps.setString(1, (String) res.getObject(1));
                ps.execute();
            }
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }
        BBDDConnexio.desconnectar();

    }
    
    public static void sort4Opcio(int i, String opcio, String ext) {
        Connection connexio = BBDDConnexio.connectar();
        ResultSet res;
        try {
            PreparedStatement ps = connexio.prepareStatement("SELECT nom, curs FROM opcions WHERE quarta_opcio = ? ORDER BY RAND() LIMIT ?");
            ps.setString(1, opcio);
            ps.setInt(2, i);
            res = ps.executeQuery();
            while(res.next()) {
                ps = connexio.prepareStatement("INSERT INTO " + ext + "(nom, curs) VALUES(?, ?)");
                ps.setString(1, (String) res.getObject(1));
                ps.setString(2, (String) res.getObject(2));
                ps.execute();
                
                
                ps = connexio.prepareStatement("DELETE FROM opcions WHERE nom = ?");
                ps.setString(1, (String) res.getObject(1));
                ps.execute();
            }
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }
        BBDDConnexio.desconnectar();
    }
    
     public static void sort5Opcio(int i, String opcio, String ext) {
        Connection connexio = BBDDConnexio.connectar();
        ResultSet res;
        try {
            PreparedStatement ps = connexio.prepareStatement("SELECT nom, curs FROM opcions WHERE quinta_opcio = ? ORDER BY RAND() LIMIT ?");
            ps.setString(1, opcio);
            ps.setInt(2, i);
            res = ps.executeQuery();
            while(res.next()) {
                ps = connexio.prepareStatement("INSERT INTO " + ext + "(nom, curs) VALUES(?, ?)");
                ps.setString(1, (String) res.getObject(1));
                ps.setString(2, (String) res.getObject(2));
                ps.execute();
                
                ps = connexio.prepareStatement("DELETE FROM opcions WHERE nom = ?");
                ps.setString(1, (String) res.getObject(1));
                ps.execute();
            }
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }
        BBDDConnexio.desconnectar();
    }
     
    public static int limit(String opcio) {
        Connection connexio = BBDDConnexio.connectar();
        ResultSet res;
        int l = -1;
        int a = -1;
        try {
           PreparedStatement ps = connexio.prepareStatement("SELECT count(*) FROM " + opcio);
           res = ps.executeQuery();
           while(res.next()) {
              l = (int) res.getObject(1);
           }
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }
        BBDDConnexio.desconnectar();
        a = (int) l;
        return a;
    }
}
