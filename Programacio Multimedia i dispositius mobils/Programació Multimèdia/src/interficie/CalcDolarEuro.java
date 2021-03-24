package interficie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

public class CalcDolarEuro implements ActionListener {
	JTextField objEuros;
	JTextField objDolars;
	double valor;
	
	CalcDolarEuro(JTextField txtDolars, JTextField txtEuros) {
		objEuros = txtEuros;
		objDolars = txtDolars;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		try {
			valor = Double.parseDouble(objDolars.getText().replace(",", "."));
			DecimalFormat meuFormat = new DecimalFormat("#, ##0.00");
			objEuros.setText(meuFormat.format(valor * 1.54));
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Introdueix un valor correcte");
		}
	}

}
