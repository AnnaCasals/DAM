package interficie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Localitat implements ActionListener {
	JTextField objLocalitat;
	
	Localitat(JTextField txt) {
		objLocalitat = txt;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		objLocalitat.setText("València");
	}

}
