package interficie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Nom implements ActionListener {
	JTextField objTxt;
	
	public Nom(JTextField txt) {
		objTxt = txt;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		objTxt.setText("Anna Salvador i Casals");
	}

}
