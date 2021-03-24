/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import vista.FinestraFitxer;

/**
 *
 * @author alumno
 */
public class Acces {
    private static File f = new File(FinestraFitxer.getFitxer().getAbsolutePath());
    
    private static File getFitxer() { return f; }
    public static void setFitxer(File fi) { f = fi; }
    
    public static void guardarLS(LlistaSeries ls) {
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ls);
            oos.close();
        } catch (IOException ex) {
            System.out.println("Error al desar el fitxer");
        }
    }
    
    public static LlistaSeries cargarLS() {
        LlistaSeries ls = new LlistaSeries();
        ObjectInputStream ois = null;
        
        try {
            FileInputStream fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            ls = (LlistaSeries) ois.readObject();
            ois.close();
        } catch (IOException io) {
            System.out.println("Error a l'obrir el fitxer");
        } finally {
            return ls;
        }
    }
    
    public static void guardarComLS(File e, LlistaSeries ls) {
        try {
            FileOutputStream fos = new FileOutputStream(e);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ls);
            oos.close();
        } catch (IOException ex) {
            System.out.println("Error al desar el fitxer");
        }
    }
     
}
