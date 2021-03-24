/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
            conexio = DriverManager.getConnection("jdbc:mysql://localhost:3306/Gestion?serverTimezone=UTC", "root", "mysql");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void InsertarDades(String ma, String mo, String nS, String n, boolean r) {
        try {
            conectar();
            PreparedStatement ps = conexio.prepareStatement("INSERT INTO Gestion(marca, model, nif, nSerie, reparacio) VALUES (?,?,?,?,?)");
            ps.setString(1, ma);
            ps.setString(2, mo);
            ps.setString(3, nS);
            ps.setString(4, n);
            ps.setBoolean(5, r);
            ps.execute();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static Object[] getPerId(int i) {
        conectar();
        PreparedStatement ps;
        ResultSet rs = null;
        Object[] a = new Object[5]; 
        try {
            ps = conexio.prepareStatement("SELECT FROM Gestion WHERE id = ?");
            ps.setInt(1, i);
            rs = ps.executeQuery();
            for(int z = 0; z < a.length; z++) {
                a[z] = rs.getObject(z + 1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }
    
    public static void actualitzar(String ma, String mo, String nS, String n, boolean r) {
        try {
            conectar();
            PreparedStatement ps = conexio.prepareStatement("UPDATE Gestion SET marca = ?, modelo = ?, nif = ?, reparacio = ? WHERE nSerie = ? ");
            ps.setString(1, ma);
            ps.setString(2, mo);
            ps.setString(3, n);
            ps.setBoolean(4, r);
            ps.setString(5, nS);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Object[]> getPerReparacio() {
        conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = conexio.createStatement();
            rs = st.executeQuery("SELECT marca, model, nSerie, nif FROM Gestion WHERE reparacio = true");
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
    
}
