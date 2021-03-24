/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codi;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Convertir {
    DecimalFormat df = new DecimalFormat("##.####");
    public static double celAKel(double c) {
        double k = 0;
        if(c < -273.15) {
            JOptionPane.showMessageDialog(null, "És menor que -273.15, baix del valor absolut");
        } else {
            k = c + 273.15;
        }
        
        return Math.round(k * Math.pow(10, 5)) / Math.pow(10, 5);
    }
    
    public static double kelACel(double k) {
        double c = 0;
        if(k < 0) {
            JOptionPane.showMessageDialog(null, "Els kelvins no poden ser negatius!!!");
        } else {
           c = k - 273.15;
        }
        return Math.round(c * Math.pow(10, 5)) / Math.pow(10, 5);
    }
    
}
