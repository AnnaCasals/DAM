/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class BaseDeDades {
    static Connection conexio = null;
    static ArrayList<Object[]> llista = new ArrayList<Object[]>();
    
    public static void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch(ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        } 
        try {
            conexio = DriverManager.getConnection("jdbc:mysql://localhost:3306/Libros?serverTimezone=UTC", "root", "mysql");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static ArrayList veureTots() {
        conectar();
        Statement st;
        ResultSet rs = null;
       
        try {
            st = conexio.createStatement();
            rs = st.executeQuery("SELECT titol, autor, genere, any FROM Llibres");
            while(rs.next()) {
                Object[] a = new Object[4];
                for(int i = 0; i < a.length; i++) {
                    a[i] = rs.getObject(i+1);
                }
                llista.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return llista;
    }
    
    public static void InsertarDades(String t, String g, String a, int any) {
        try {
            conectar();
            PreparedStatement ps = conexio.prepareStatement("INSERT INTO Llibres(titol, genere, autor, any) VALUES (?, ?, ?, ?)");
            ps.setString(1, t);
            ps.setString(2, g);
            ps.setString(3, a);
            ps.setInt(4, any);
            ps.execute();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void borrar(int id) {
        conectar();
        try {
            PreparedStatement ps = conexio.prepareStatement("DELETE FROM Llibres WHERE id_llibre = ?");
            ps.setInt(1, id);
            ps.execute();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void actualitzar(String t, String a, String g, int any, int id) {
        conectar();
        try {
            PreparedStatement ps = conexio.prepareStatement("UPDATE Llibres SET titol = ?, autor = ?, genere = ?, any = ? WHERE id_llibre = ?");
            ps.setString(1, t);
            ps.setString(2, a);
            ps.setString(3, g);
            ps.setInt(4, any);
            ps.setInt(5, id);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static int idLLibre(String t, String a, String g, int any) {
        conectar();
        ResultSet rs = null;
        int id = 0;
        try {
            PreparedStatement ps = conexio.prepareStatement("SELECT id_llibre FROM Llibres WHERE titol = ? AND autor = ? AND genere = ? AND any = ?");
            ps.setString(1, t);
            ps.setString(2, a);
            ps.setString(3, g);
            ps.setInt(4, any);
            rs = ps.executeQuery();
            while(rs.next()) {
                id = rs.getInt(1);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return id;
    }
}
