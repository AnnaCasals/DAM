package tema7_Interficies;
import java.awt.event.*;
import javax.swing.*;

public class Aceptar2 implements ActionListener {
	JTextField objMensaje;
	
	public Aceptar2(JTextField txtMensaje) {
		objMensaje = txtMensaje;
	}
	public void actionPerformed(ActionEvent arg0) {
		objMensaje.setText("Anna Salvador i Casals");
	}
}
