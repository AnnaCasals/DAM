/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Serie implements Serializable {
    private String titol;
    private String genere;
    private String productors;
    private int any;
    private int temporades;
    private int valoracio;
    
    public Serie() {
        titol = "";
        genere = "";
        productors = "";
        any = 0;
        temporades = 0;
        valoracio = 0;
    }
    
    public Serie (String tit, String g, String p, int a, int t, int vp) {
        titol = tit;
        genere = g;
        productors = p;
        any = a;
        temporades = t;
        valoracio = vp;
    }
    
    public void setTitol(String t) { titol = t; }
    public void setGenere(String g) { genere = g; }
    public void setProductors(String p) { productors = p; }
    public void setAny(int a) { any = a; }
    public void setTemporades(int t) { temporades = t; }
    public void setValoracio(int v) { valoracio = v; }
    
    public String getTitol() { return titol; }
    public String getGenere() { return genere; }
    public String getProductors() { return productors; }
    public int getAny() { return any; }
    public int getTemporades() { return temporades; }
    public int getValoracio() { return valoracio; }
    
}
