/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.*;
import java.util.*;

/**
 *
 * @author alumno
 */
public class LlistaClients implements Serializable {
    private ArrayList<Client> llistaClients;
    
    public LlistaClients() {
        llistaClients = new ArrayList<>();
    }
    
    public Client getClient(int p) {
        return llistaClients.get(p);
    }
    
    public void setClient(Client c) {
        llistaClients.add(c);
    }
    
    public int llargaria() {
        return llistaClients.size();
    }
    
    public void eliminar(int p) {
        llistaClients.remove(p);
    }
    
}
