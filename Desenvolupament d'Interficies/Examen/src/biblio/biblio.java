/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblio;

import Model.*;

/**
 *
 * @author alumno
 */
public class biblio {
    public static void main(String[] args) {
        Client s = new Client("123456789R", "Anna", "Salvador Casals", "C/ ASC", 987654321);
        LlistaClients ls = new LlistaClients();
        ls.setClient(s);
        
        s = new Client("987654321A", "Manu", "Betoret Garcia", "C/MBG", 125872684);
        ls.setClient(s);
        
        Acces.guardarLS(ls);
        
                
    }
    
}
