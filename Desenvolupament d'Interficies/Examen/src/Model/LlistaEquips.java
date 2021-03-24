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
public class LlistaEquips implements Serializable {
      private ArrayList<Equip> llistaEquips;
    
    public LlistaEquips() {
        llistaEquips = new ArrayList<>();
    }
    
    public Equip getEquip(int p) {
        return llistaEquips.get(p);
    }
    
    public void setEquip(Equip c) {
        llistaEquips.add(c);
    }
    
    public int llargaria() {
        return llistaEquips.size();
    }
    
    public void eliminar(int p) {
        llistaEquips.remove(p);
    }
}
