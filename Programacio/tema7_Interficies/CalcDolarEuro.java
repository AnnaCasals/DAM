package tema7_Interficies;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class CalcDolarEuro implements ActionListener {
	JTextField objEuros;
	JTextField objDolares;
	double valor;
	
	public CalcDolarEuro(JTextField txtDolares, JTextField txtEuros) {
		objDolares = txtDolares;
		objEuros = txtEuros;
	}
	public void actionPerformed(ActionEvent arg0) {
		try {
			valor = Double.parseDouble(objDolares.getText().replace(',','.'));
			DecimalFormat miFormato = new DecimalFormat("#, ##0.00");
			objEuros.setText(miFormato.format((valor / 1.54)));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Introduce un valor correcto");
		}
	}
}
