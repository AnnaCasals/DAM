package tema7_Interficies;
import java.awt.event.*;
import javax.swing.*;

public class Localidad implements ActionListener {
	JTextField objMensaje;
	
	public Localidad(JTextField txtMensaje) {
		objMensaje = txtMensaje;
	}
	
	public void actionPerformed(ActionEvent e) {
		objMensaje.setText("València");
	}

}
