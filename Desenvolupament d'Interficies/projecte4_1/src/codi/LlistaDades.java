/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codi;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class LlistaDades implements Serializable {
    private ArrayList<Dada> llistaDades;
    
    public LlistaDades() {
        llistaDades = new ArrayList<>();
    }
    
    public Dada getDada(int p) {
        return llistaDades.get(p);
    }
    
    public void setDada(Dada d) {
        llistaDades.add(d);
    }
    
    public int llargaria() {
        return llistaDades.size();
    }
    
    public void eliminar(int p) {
        llistaDades.remove(p);
    }
    
    public void actualitzar(Dada d, int p) {
        llistaDades.get(p).setId(d.getId());
        llistaDades.get(p).setNota(d.getNota());
    }
}
