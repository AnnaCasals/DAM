package ud1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Acceptar implements ActionListener {
	JTextField objText;
	
	Acceptar(JTextField text) {
		objText = text;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, objText.getText());
		
	}

}
