/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Libro implements Serializable {
    private String titol;
    private String autor;
    private String genere;
    private int any;
    
    public Libro() {
        this.titol = "";
        this.autor = "";
        this.genere = "";
        this.any = 0;
    }
    
    public Libro(String t, String a, String g, int any) {
        this.titol = t;
        this.autor = a;
        this.genere = g;
        this.any = any;
    }
    
    public String getTitol() { return titol; }
    public String getAutor() { return autor; }
    public String getGenere() { return genere; }
    public int getAny() { return any; }
    
    public void setTitol(String t) { titol = t; }
    public void setAutor(String a) { autor = a; }
    public void setGenere(String g) { genere = g; }
    public void setAny(int a) { any = a; }
}
