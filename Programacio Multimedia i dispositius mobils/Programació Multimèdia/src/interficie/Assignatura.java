package interficie;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Assignatura implements ActionListener {
	JTextField objAssignatura;
	
	Assignatura(JTextField txt) {
		objAssignatura = txt;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		objAssignatura.setText("Programació Multimèdia i Dispositius Mòbils");
	}

}
