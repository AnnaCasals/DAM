package tema7_Interficies;
import java.awt.event.*;
import javax.swing.*;

public class Asignatura2 implements ActionListener {
	JTextField objMensaje;
	
	public Asignatura2(JTextField txtMensaje) {
		objMensaje = txtMensaje;
	}
	
	public void actionPerformed(ActionEvent e) {
		objMensaje.setText("Programació");
	}
}
