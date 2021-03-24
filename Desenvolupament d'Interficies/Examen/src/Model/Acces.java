/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import Vista.*;
/**
 *
 * @author alumno
 */
public class Acces {
    private static File f = new File(FinestraFitxer.getFitxer().getAbsolutePath());
    
    public static void guardarLS(LlistaClients ls) {
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ls);
            oos.close();
        } catch (IOException ex) {
            System.out.println("Error al desar el fitxer");
        }
    }
    
     public static LlistaClients cargarLS() {
        LlistaClients ls = new LlistaClients();
        ObjectInputStream ois = null;
        
        try {
            FileInputStream fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            ls = (LlistaClients) ois.readObject();
            ois.close();
        } catch (IOException io) {
            System.out.println("Error a l'obrir el fitxer");
        } finally {
            return ls;
        }
    }
}
