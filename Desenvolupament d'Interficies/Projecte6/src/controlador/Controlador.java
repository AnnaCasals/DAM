/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import model.*;
import vista.*;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Controlador {
    static int primera, segona, tercera, quarta, quinta;
    static int primera1, segona1, tercera1, quarta1, quinta1;
    
    static String[] opcions = new String[100];
    
    public static void pasarCSV(File f) {
        ImportarCsv.importarExcel(f.getAbsolutePath());
        BBDDOpcions.borrarPFila();
        BBDDOpcions.borrarElementsTaules();
    }
    
    public static ArrayList<String> extraescolars() {
        ArrayList<String> extra = BBDDExtraescolars.mostrarExtraescolars();
        for(int i = 0; i < extra.size(); i++) {
            opcions[i] = extra.get(i);
        }
        return extra;
    }
    
    public static void pOpcio(String opcio, int limit, String ext) {
        BBDDTaules.sort1Opcio(limit, opcio, ext);        
    }
    
    public static void sOpcio() {
        if(primera1 > 0) {
            BBDDTaules.sort2Opcio(primera1, opcions[0], "primeraextraescolar");
        }
        if(segona1 > 0) {
            BBDDTaules.sort2Opcio(segona1, opcions[1], "segonaextraescolar");
        }
        if(tercera1 > 0) {
            BBDDTaules.sort2Opcio(tercera1, opcions[2], "terceraextraescolar");
        }
        if(quarta1 > 0) {
            BBDDTaules.sort2Opcio(quarta1, opcions[3], "quartaextraescolar");
        }
        if(quinta1 > 0) {
            BBDDTaules.sort2Opcio(quinta1, opcions[4], "quintaextraescolar");
        }
        limits();
    }
    
     public static void tOpcio() {
        if(primera1 > 0) {
            BBDDTaules.sort2Opcio(primera1, opcions[0],"primeraextraescolar");
        }
        if(segona1 > 0) {
            BBDDTaules.sort2Opcio(segona1, opcions[1], "segonaextraescolar");
        }
        if(tercera1 > 0) {
            BBDDTaules.sort2Opcio(tercera1, opcions[2], "terceraextraescolar");
        }
        if(quarta1 > 0) {
            BBDDTaules.sort2Opcio(quarta1, opcions[3], "quartaextraescolar");
        }
        if(quinta1 > 0) {
            BBDDTaules.sort2Opcio(quinta1, opcions[4], "quintaextraescolar");
        }
        limits();
    }
     
    public static void quartaOpcio() {
        if(primera1 > 0) {
            BBDDTaules.sort2Opcio(primera1, opcions[0], "primeraextraescolar");
        }
        if(segona1 > 0) {
            BBDDTaules.sort2Opcio(segona1, opcions[1], "segonaextraescolar");
        }
        if(tercera1 > 0) {
            BBDDTaules.sort2Opcio(tercera1, opcions[2], "terceraextraescolar");
        }
        if(quarta1 > 0) {
            BBDDTaules.sort2Opcio(quarta1, opcions[3], "quartaextraescolar");
        }
        if(quinta1 > 0) {
            BBDDTaules.sort2Opcio(quinta1, opcions[4], "quintaextraescolar");
        }
        limits();
    }
    
     public static void quintaOpcio() {
         if(primera1 > 0) {
            BBDDTaules.sort2Opcio(primera1, opcions[0], "primeraextraescolar");
        }
        if(segona1 > 0) {
            BBDDTaules.sort2Opcio(segona1, opcions[1], "segonaextraescolar");
        }
        if(tercera1 > 0) {
            BBDDTaules.sort2Opcio(tercera1, opcions[2], "terceraextraescolar");
        }
        if(quarta1 > 0) {
            BBDDTaules.sort2Opcio(quarta1, opcions[3], "quartaextraescolar");
        }
        if(quinta1 > 0) {
            BBDDTaules.sort2Opcio(quinta1, opcions[4], "quintaextraescolar");
        }
        limits();
    }
     
    public static void limits() {
        int l = BBDDTaules.limit("primeraextraescolar");
        primera1 = primera - l;
        
        l = BBDDTaules.limit("segonaextraescolar");
        segona1 = segona - l;
        
        l = BBDDTaules.limit("terceraextraescolar");
        tercera1 = tercera - l;
        
        l = BBDDTaules.limit("quartaextraescolar");
        quarta1 = quarta - l;
        
        l = BBDDTaules.limit("quintaextraescolar");
        quinta1 = quinta - l;
    }
    
    public static void insertarActivitat(String a) {
        BBDDExtraescolars.insertarExtraescolar(a);
    }
    
    public static void borrarActivitat(String a) {
        BBDDExtraescolars.borrarExtraescolar(a);
    }
}
