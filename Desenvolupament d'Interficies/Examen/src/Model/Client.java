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
public class Client {
    private String nif;
    private String nom;
    private String cognom;
    private String direccio;
    private int telefon;
    
    public Client() {
        nif = "";
        nom = "";
        cognom = "";
        direccio = "";
        telefon = 0;
    }
    
    public Client(String ni, String n, String c, String d, int t) {
        nif = ni;
        nom = n;
        cognom = c;
        direccio = d;
        telefon = t;
    }
    
    public void setNif(String n) { nif = n; }
    public void setNom(String n) { nom = n; }
    public void setCognom(String c) { cognom = c; }
    public void setDireccio(String d) { direccio = d; }
    public void setTelefon(int t) { telefon = t; }
    
    public String getNif() { return nif; }
    public String getNom() { return nom; }
    public String getCognom() { return cognom; }
    public String getDireccio() { return direccio; }
    public int getTelefon() { return telefon; }
   
}
