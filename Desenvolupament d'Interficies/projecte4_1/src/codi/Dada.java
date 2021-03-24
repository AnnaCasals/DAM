/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codi;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Dada implements Serializable {
    int id;
    String nota;
    
    public Dada() {
        id = 0;
        nota = "";
    }
    
    public Dada(String n) {
        nota = n;
    }
    
    public Dada(int i, String n) {
        id = i;
        nota = n;
    }
    
    public int getId() { return id; }
    public String getNota() { return nota; }
    
    public void setId(int i) { id = i; }
    public void setNota(String n) { nota = n; }
    
}
