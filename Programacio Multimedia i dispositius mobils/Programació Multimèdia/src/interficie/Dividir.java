package interficie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Dividir implements ActionListener {
	JTextField objDividendo;
	JTextField objDivisor;
	JLabel objResultado;
	
	Dividir(JTextField txtDividendo, JTextField txtDivisor, JLabel txtResultado){
		objDividendo = txtDividendo;
		objDivisor = txtDivisor;
		objResultado = txtResultado;
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		double b;
		// TODO Auto-generated method stub
		if(objDividendo.getText().equals("0") && objDivisor.getText().equals("0")) {
			objResultado.setText("Indeterminado");
		} else if(objDivisor.getText().equals("0")) {
			objResultado.setText("Infinito");
		} else {
			b = Double.parseDouble(objDividendo.getText())/Double.parseDouble(objDivisor.getText());
			objResultado.setText("" + b);
		}

	}

}
