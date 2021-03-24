package interficie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Acceptar implements ActionListener {
	JTextField objTxt;
	
	public Acceptar(JTextField txt) {
		objTxt = txt;
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		objTxt.setText("Avançat amb Java");
	}
	
}
