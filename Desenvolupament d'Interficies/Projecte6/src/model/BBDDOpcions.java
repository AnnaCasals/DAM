/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;


/**
 *
 * @author alumno
 */
public class BBDDOpcions {
    public static void borrarElementsTaules() {
        Connection connexio = BBDDConnexio.connectar();
        try {
            //PreparedStatement ps = connexio.prepareStatement("DELETE FROM opcions");
            //ps.execute();
            
            PreparedStatement ps = connexio.prepareStatement("DELETE FROM primeraextraescolar");
            ps.execute();
            
            ps = connexio.prepareStatement("DELETE FROM segonaextraescolar");
            ps.execute();
            
            ps = connexio.prepareStatement("DELETE FROM terceraextraescolar");
            ps.execute();
            
            ps = connexio.prepareStatement("DELETE FROM quartaextraescolar");
            ps.execute();
            
            ps = connexio.prepareStatement("DELETE FROM quintaextraescolar");
            ps.execute();
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }
        BBDDConnexio.desconnectar();
    }
    //Borrar la primera fila on s'han posat els noms de les columnes del excel
    public static void borrarPFila() {
        Connection connexio = BBDDConnexio.connectar();
        
        try {
            Statement pes = connexio.createStatement();
            PreparedStatement ps = connexio.prepareStatement("DELETE FROM opcions WHERE nom = 'Nombre'");
            ps.execute();
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }
        BBDDConnexio.desconnectar();
    }
    
}
