package interficie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CalcEuroDolar implements ActionListener {
	JTextField objEuros;
    JTextField objDolars;
    double valor;
    
    CalcEuroDolar(JTextField txtEuros, JTextField txtDolars) {
        objEuros = txtEuros;
        objDolars = txtDolars;
    }
    
    public void actionPerformed(ActionEvent arg0) {
        try {
            valor = Double.parseDouble(objEuros.getText().replace(",", "."));
            DecimalFormat meuFormat = new DecimalFormat("#, ##0.00");
            objDolars.setText(meuFormat.format(valor / 1.54));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Introdueix un valor correcte");
        }
    }

}
