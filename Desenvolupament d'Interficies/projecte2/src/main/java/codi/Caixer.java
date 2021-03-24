/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codi;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Caixer {
    
    double quantitat;
    int eleccio;
    
    ImageIcon imgbanc = new ImageIcon("src\\main\\java\\src\\banc.jpg");
    Icon img = new ImageIcon(imgbanc.getImage().getScaledInstance(90, -1, Image.SCALE_DEFAULT));
    
    ImageIcon imgdiners = new ImageIcon("src\\main\\java\\src\\diners.jpg");
    Icon img2 = new ImageIcon(imgdiners.getImage().getScaledInstance(90, -1, Image.SCALE_DEFAULT));
    
    Caixer() {
        try {
            quantitat = Double.parseDouble((String) JOptionPane.showInputDialog(null, entrada(), "Entrada", JOptionPane.QUESTION_MESSAGE, img, null, null));
            boolean a = true;
        
            while(a) {
                eleccio = Integer.parseInt((String)JOptionPane.showInputDialog(null, menu(), "Entrada", 1, img, null, null));
            
                switch(eleccio) {
                    case 1:
                        quantitat += Double.parseDouble((String) JOptionPane.showInputDialog(null, "Quant desitges abonar?", "Entrada", 1, img2, null, null));
                        JOptionPane.showMessageDialog(null, "El saldo actual és: " + quantitat + "€");
                        break;
                    
                    case 2:
                        quantitat -= Double.parseDouble((String) JOptionPane.showInputDialog(null, "Quant desitges retirar?", "Entrada", 1, img2, null, null));
                        JOptionPane.showMessageDialog(null, "El saldo actual és: " + quantitat + "€");
                        break;
                    
                    case 3:
                        JOptionPane.showMessageDialog(null, "El saldo actual és: " + quantitat + "€");
                        break;
                    
                    case 4:
                        JOptionPane.showMessageDialog(null, "Has decidit EIXIR");
                        System.exit(0);
                        break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "Error en el número");
                }
            }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el número");
        }
    }
    
    public String entrada() {
        return "Benvingut al caixer! \n\nAmb quina quantitat desitja obrir el seu compte?";
    }
    
    public String menu() {
        String[] m = {"1.- Realitzar un deposit", "2.-Realitzar una retirada", "3.-Revisar el teu saldo", "4.-Eixir" };
        String s = "Que desitges realitzar? \n";
        for(int i = 0; i < m.length; i++) {
            s+= "\n" + m[i];
        }
        return s;
    }
    
    public static void main(String[] args) {
        Caixer a = new Caixer();
    }
    
}
