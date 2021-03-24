package tema7_Interficies;
import java.awt.event.*;
import javax.swing.*;

public class Localidad2 implements ActionListener {
	JTextField objMensaje;
	
	public Localidad2(JTextField txtMensaje) {
		objMensaje = txtMensaje;
	}
	
	public void actionPerformed(ActionEvent e) {
		objMensaje.setText("València");
	}
}
