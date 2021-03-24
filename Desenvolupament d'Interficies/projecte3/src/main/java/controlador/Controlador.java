/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
import model.Acces;
import model.LlistaSeries;
import model.Serie;

/**
 *
 * @author alumno
 */
public class Controlador {
    private int posicio;
    private LlistaSeries ls;
    
    public Controlador() {
        posicio = 0;
        ls = new LlistaSeries();
        ls = Acces.cargarLS();
    }
    
    public Serie primera() {
        posicio = 0;
        return ls.getSerie(posicio);
    }
    
    public Serie ultima() {
        posicio = ls.llargaria()-1;
        return ls.getSerie(posicio);
    }
    
    public Serie anterior() {
        if(posicio > 0) {
            posicio--;
        }
        return ls.getSerie(posicio);
    }
    
    public Serie seguent() {
        posicio++;
        if(posicio == ls.llargaria()) {
            posicio--;
        }
        return ls.getSerie(posicio);
    }
    
    public void nova(Serie s) {
        ls.setSerie(s);
        posicio = ls.llargaria()-1;
        Acces.guardarLS(ls);
    }
    
    public void eliminar() {
        //elimine la posició actual i guarde canvis el el fitxer
        ls.eliminar(posicio);
        //guarde el fitxer
        Acces.guardarLS(ls);
    }
    
    public void actualitzar(Serie s) {
        //Actualitze la LlistaSeries i la guarde en el fitzer
        ls.actualitzar(s, posicio);
        Acces.guardarLS(ls);
    }
    
    public void guardarCom(File f) {
        Acces.guardarComLS(f, ls);
    }
    
    public void setFitxer(File f) {
        Acces.setFitxer(f);
    }
    
    public void carregar() {
        posicio = 0;
        ls = new LlistaSeries();
        ls = Acces.cargarLS();
    }
}
