package interficie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalcDNI implements ActionListener {
	JTextField objTxt;
	JLabel objRes;
	
	CalcDNI(JTextField txt, JLabel lbl) {
		objTxt = txt;
		objRes = lbl;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		try {
			String letrasNIF = "TRWAGMYFPDXBNJZSQVHLCKET";
			int dni = Integer.parseInt(objTxt.getText());
			int pos = dni % 23;
			objRes.setText(objTxt.getText() + "-" + letrasNIF.charAt(pos));
		} catch (Exception e) {
			
		}
	}

}
