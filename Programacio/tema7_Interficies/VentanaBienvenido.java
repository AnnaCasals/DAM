package tema7_Interficies;
import java.awt.*;
import javax.swing.*;

public class VentanaBienvenido {
	JFrame miVentana = new JFrame("¡Bienvenido!");
	JPanel marPrincipal = new JPanel();
	JTextField txtBienvenido = new JTextField(20);
	
	public VentanaBienvenido() {
		miVentana.setSize(400, 100);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new BorderLayout());
		
		txtBienvenido.setText("Bienvenido a Java");
		txtBienvenido.setFont(new Font ("Arial" , 0,20));
		txtBienvenido.setForeground(Color.BLUE);
		txtBienvenido.setBackground(Color.YELLOW);
		txtBienvenido.setHorizontalAlignment(JTextField.CENTER);
		
		marPrincipal.add(txtBienvenido);
		miVentana.add("North", marPrincipal);
		miVentana.setVisible(true);
	}
	
	public static void main(String[] args) {
		new VentanaBienvenido();
	}
}
