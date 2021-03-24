package tema7_Interficies;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalcEuroDolar2 implements ActionListener{

	JTextField objEuros;
	JTextField objDolares;
	double valor;
	
	public CalcEuroDolar2(JTextField txtEuros, JTextField txtDolares) {
		objEuros = txtEuros;
		objDolares = txtDolares;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		try {
			valor = Double.parseDouble(objEuros.getText().replace(',', '.'));
			DecimalFormat miFormato = new DecimalFormat("#,##0.00");
			objDolares.setText(miFormato.format((valor * 1.54)));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Introduce un valor correcto");
		}
	}

}
