/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author alumno
 */
public class Equip {
    private String marca;
    private String model;
    private String nSerie;
    private String nif;
    private Boolean reparacio;
    
    public Equip() {
        marca = "";
        model = "";
        nSerie = "";
        nif = "";
        reparacio = false;
    }
    public Equip(String ma, String mo, String ns, String n, Boolean r) {
        marca = ma;
        model = mo;
        nSerie = ns;
        nif = n;
        reparacio = r;
    }
    
    public void setMarca(String s) { marca = s; }
    public void setModel(String s) { model = s; }
    public void setNSerie(String s) { nSerie = s; }
    public void setNif(String s) { nif = s; }
    public void SetReparacio(Boolean r) { reparacio = r; }
    
    public String getMarca() { return marca; }
    public String getModel() { return model; }
    public String getnSerie() { return nSerie; }
    public String getNif() { return nif; }
    public Boolean getReparacio() { return reparacio; }
    
}
