package interficie;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class CalArrel implements ActionListener {
	JTextField objNumero;
	JLabel objResultat;
	int num;
	double res;
	
	CalArrel(JTextField txtNumero, JLabel txtResultat) {
		objNumero = txtNumero;
		objResultat = txtResultat;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		num = Integer.parseInt(objNumero.getText());
		if (num < 0) {
			objResultat.setText("No tiene raiz real");
		} else {
			res = Math.round((Math.sqrt(num)) * Math.pow(10, 2)) / Math.pow(10, 2);
			objResultat.setText("" + res);
		}
	}

}
