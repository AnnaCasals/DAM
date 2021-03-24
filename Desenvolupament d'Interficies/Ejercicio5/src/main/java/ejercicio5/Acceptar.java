/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.*;

/**
 *
 * @author alumno
 */
public class Acceptar implements ActionListener {
    static JLabel objTxt;
    
    public Acceptar(JLabel txt) {
        objTxt = txt;
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        String a;
        a = JOptionPane.showInputDialog("Escriu alguna cosa... ");
        objTxt.setText(a);
    }
    
}
