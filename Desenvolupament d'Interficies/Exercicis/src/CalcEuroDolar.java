import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.*;
public class CalcEuroDolar {
	JTextField objEuros;
	JTextField objDolares;
	double valor;
	public CalcEuroDolar(JTextField txtEuros, JTextField txtDolares) {
		objEuros = txtEuros;
		objDolares = txtDolares;
	}
	public void actionPerformed(ActionEvent arg0) {
		try {
			valor = Double.parseDouble(objEuros.getText().replace(",", "."));
			DecimalFormat miFormato = new DecimalFormat("#, ##0.00");
			objDolares.setText(miFormato.format((valor * 1.54)));
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Introduce un valor correcto");
		}
	}
}
