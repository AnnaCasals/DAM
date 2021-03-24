package interficie;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Centre implements ActionListener {
	JTextField objCentre;

	Centre(JTextField txt) {
		objCentre = txt;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		objCentre.setText("IES El Grao");
	}

}
