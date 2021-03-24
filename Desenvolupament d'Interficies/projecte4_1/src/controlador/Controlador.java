/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import codi.BaseDeDades;

import java.sql.*;
import java.util.ArrayList;
import codi.*;

/**
 *
 * @author alumno
 */
public class Controlador {
    private int posicio;
    private LlistaDades ld = new LlistaDades();
    private ArrayList<Object[]> llista = BaseDeDades.VeureTots();
    
    public Controlador() {
        posicio = 0;
        pasarLlistes();
    }
    
    public void pasarLlistes() {
        int i; String n;
        for(int j = 0; j < llista.size(); j++) {
            i = (int) llista.get(j)[0];
            n = (String) llista.get(j)[1];
            Dada z = new Dada(i, n);
            ld.setDada(z);
        }
    }
    
    public Dada primera() {
        posicio = 0;
        return ld.getDada(posicio);
    }
    
    public Dada ultima() {
        posicio = ld.llargaria() - 1;
        return ld.getDada(posicio);
    }
    
    public Dada anterior() {
        if(posicio > 0) {
            posicio--;
        } 
        return ld.getDada(posicio);
    }
    
    public Dada seguent() {
        posicio++;
        if(posicio == ld.llargaria()) {
            posicio--;
        }
        return ld.getDada(posicio);
    }
    
    public void nova(Dada d) {
        BaseDeDades.InsertarNota(d.getNota());
        
        ArrayList<Object[]> z = BaseDeDades.VeureTots();
        Object[] a = z.get(z.size() - 1);
        int i = (int) a[0];
        
        d = new Dada(i, d.getNota());
        
        posicio = ld.llargaria() - 1;
        ld.setDada(d);
    }
    
    public Dada buscarPerId(int i) {
        Object[] b = BaseDeDades.BuscarId(i);
        Dada a = new Dada((int) b[0], (String) b[1]);
        return a;
    }
}
