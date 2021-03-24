package tema7_Interficies;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class CalcEuroDolae implements ActionListener {
	JTextField objEuros;
	JTextField objDolares;
	double valor;
	
	public CalcEuroDolae(JTextField txtEuros, JTextField txtDolares) {
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
