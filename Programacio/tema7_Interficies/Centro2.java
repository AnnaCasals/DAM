package tema7_Interficies;
import java.awt.event.*;
import javax.swing.*;

public class Centro2 implements ActionListener {
	JTextField objMensaje;
	
	public Centro2(JTextField txtMensaje) {
		objMensaje = txtMensaje;
	}
	
	public void actionPerformed(ActionEvent e) {
		objMensaje.setText("IES El Grao");
	}
}
