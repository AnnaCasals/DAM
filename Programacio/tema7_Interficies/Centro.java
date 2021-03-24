package tema7_Interficies;
import java.awt.event.*;
import javax.swing.*;

public class Centro implements ActionListener {
	JTextField objMensaje;
	
	public Centro(JTextField txtMensaje) {
		objMensaje = txtMensaje;
	}
	
	public void actionPerformed(ActionEvent e) {
		objMensaje.setText("Colegio Retamar");
	}
}
