package interficie;

import javax.swing.*;
import java.awt.*;

public class FinestraBenvinguda {
	JFrame finestra = new JFrame();
	JPanel marPrincipal = new JPanel();
	JTextField txtBenvinguda = new JTextField();
	
	FinestraBenvinguda() {
		finestra.setSize(400, 100);
		finestra.setLocationRelativeTo(null);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		finestra.setLayout(new BorderLayout());
		
		finestra.setTitle("Benvinguda!!");
		txtBenvinguda.setText("Benvinguda a Java");
		txtBenvinguda.setFont(new Font("Arial", 0, 20));
		txtBenvinguda.setForeground(Color.BLUE);
		txtBenvinguda.setBackground(Color.YELLOW);
		txtBenvinguda.setHorizontalAlignment(JTextField.CENTER);
		
		marPrincipal.add(txtBenvinguda);
		finestra.add("North", marPrincipal);
		finestra.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FinestraBenvinguda();
	}
}
