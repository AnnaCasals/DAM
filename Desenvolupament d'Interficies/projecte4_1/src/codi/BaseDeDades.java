/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codi;


import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class BaseDeDades {
    static Connection conexio = null;
    static ArrayList<Object[]> llista = new ArrayList<Object[]>();
    
    public static Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch(ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        } 
        try {
            conexio = DriverManager.getConnection("jdbc:mysql://localhost:3306/Prova?serverTimezone=UTC", "root", "mysql");
        }catch(Exception e) {
            e.printStackTrace();
        }
        return conexio;
    }
    
    public static ArrayList VeureTots() {
        Connection cn = conectar();
        Statement st;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM Prova");
            while(rs.next()) {
                Object[] a = new Object[2];
                for(int i = 0; i < a.length; i++) {
                    a[i] = rs.getObject(i + 1);
                }
                llista.add(a);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return llista;
    }
    
    public static void InsertarNota(String n) {
        try {
            conectar();
            PreparedStatement ps = conexio.prepareStatement("INSERT INTO prova(nota) VALUES(?)");
            ps.setString(1, n);
            ps.execute();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static Object[] BuscarId(int i) {
        conectar();
        ResultSet rs = null;
        Object[] a = new Object[2];
        try {
            PreparedStatement ps = conexio.prepareStatement("SELECT * FROM prova WHERE id = ?");
            ps.setInt(1, i);
            rs = ps.executeQuery();
            while(rs.next()) {
                a[0] = rs.getObject(1);
                a[1] = rs.getObject(2);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return a;
    }
    
  
}
