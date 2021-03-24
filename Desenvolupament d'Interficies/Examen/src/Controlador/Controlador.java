/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.LlistaClients;
import java.io.*;
import Model.*;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Controlador {
    private int posicio;
    private LlistaClients ls;
    private LlistaEquips le = new LlistaEquips();
    private int posicioEquips;
    ArrayList<Object[]> llista = BaseDeDades.getPerReparacio();
    
    public Controlador() {
        posicio = 0;
        posicioEquips = 0;
        ls = new LlistaClients();
        ls = Acces.cargarLS();
        pasarLlistes();
    }
    
    public void nova(Client s) {
        ls.setClient(s);
        posicio = ls.llargaria()-1;
        Acces.guardarLS(ls);
    }
    
    public void eliminar() {
        //elimine la posició actual i guarde canvis el el fitxer
        ls.eliminar(posicio);
        //guarde el fitxer
        Acces.guardarLS(ls);
    }
    
    public void nuevo(Equip e){
        BaseDeDades.InsertarDades(e.getMarca(), e.getModel(), e.getnSerie(), e.getNif(), e.getReparacio());
    }
    
    public Equip equipPerId(int i) {
        Object[] c = BaseDeDades.getPerId(i);
        String marca = (String) c[0];
        String model = (String) c[1];
        String nSerie = (String) c[2];
        String nif = (String) c[3];
        Boolean reparacio = (Boolean) c[4];
        
        Equip a = new Equip(marca, model, nSerie, nif, reparacio);
        return a;
    }
    
    public void pasarLlistes() {
        String ma; String mo; String ns; String nif;
            for(int i = 0; i < llista.size(); i++) {
                ma = (String) llista.get(i)[0];
                mo = (String) llista.get(i)[1];
                ns = (String) llista.get(i)[2];
                nif = (String) llista.get(i)[3];
                Equip z = new Equip(ma, mo, ns, nif, true);
                le.setEquip(z);
            }
    }
    
}
