/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class LlistaSeries implements Serializable {
    
    private ArrayList<Serie> llistaSeries;
    
    public LlistaSeries() {
        llistaSeries = new ArrayList<>();
    }
    
    public Serie getSerie(int p) {
        return llistaSeries.get(p);
    }
    
    public void setSerie(Serie s) {
        llistaSeries.add(s);
    }
    
    public int llargaria() {
        return llistaSeries.size();
    }
    
    public void eliminar(int p) {
        llistaSeries.remove(p);
    }
    
    public void actualitzar(Serie s, int p) {
        llistaSeries.get(p).setTitol(s.getTitol());
        llistaSeries.get(p).setGenere(s.getGenere());
        llistaSeries.get(p).setProductors(s.getProductors());
        llistaSeries.get(p).setAny(s.getAny());
        llistaSeries.get(p).setTemporades(s.getTemporades());
        llistaSeries.get(p).setValoracio(s.getValoracio());
    }
}
