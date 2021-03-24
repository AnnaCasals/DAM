package tema7_Interficies;
import java.awt.*;
import javax.swing.*;

public class VentanaNombre {
	JFrame miVentana = new JFrame("");
	JPanel marMensaje = new JPanel();
	JPanel marBotones = new JPanel();
	JTextField txtMensaje = new JTextField(20);
	JButton botAceptar = new JButton();
	
	public VentanaNombre() {
		miVentana.setSize(400,120);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new BorderLayout());
		
		txtMensaje.setText("");
		txtMensaje.setFont(new Font("Arial", 0,20));
		txtMensaje.setForeground(Color.blue);
		txtMensaje.setBackground(Color.yellow);
		txtMensaje.setHorizontalAlignment(JTextField.CENTER);
		
		botAceptar.setIcon(new ImageIcon(getClass().getResource("Aceptar.gif")));
		botAceptar.setText("Aceptar");
		botAceptar.setFont(new Font("Arial", 0,14));
		botAceptar.setPreferredSize(new Dimension(120, 40));
		botAceptar.addActionListener(new Aceptar2(txtMensaje));
		
		marMensaje.add(txtMensaje);
		marBotones.add(botAceptar);
		miVentana.add("North", marMensaje);
		miVentana.add("South", marBotones);
		miVentana.setVisible(true);
	}
	public static void main(String[] args) {
		new VentanaNombre();
	}
}
