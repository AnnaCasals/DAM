package tema7_Interficies;
import java.awt.*;
import javax.swing.*;
public class Hola {
	JFrame miVentana = new JFrame("¡Hola!");
	JPanel marPrincipal = new JPanel();
	JTextField txtBienvenido = new JTextField(20);
	
	public Hola() {
		miVentana.setSize(500, 200);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new BorderLayout());
		
		txtBienvenido.setText("Anna Salvador i Casals");
		txtBienvenido.setFont(new Font ("Arial" , 0,20));
		txtBienvenido.setForeground(Color.RED);
		txtBienvenido.setBackground(Color.ORANGE);
		txtBienvenido.setHorizontalAlignment(JTextField.CENTER);
		
		marPrincipal.add(txtBienvenido);
		miVentana.add("South", marPrincipal);
		miVentana.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Hola();
	}
}
