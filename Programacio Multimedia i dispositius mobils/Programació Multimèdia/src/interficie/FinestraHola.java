package interficie;

import javax.swing.*;
import java.awt.*;

public class FinestraHola {
	JFrame finestra = new JFrame();
	JPanel marText = new JPanel();
	JTextField txtNom = new JTextField();
	
	FinestraHola() {
		finestra.setSize(500, 200);
		finestra.setLayout(new BorderLayout());
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		finestra.setLocationRelativeTo(null);
		finestra.setTitle("Hola");
		
		txtNom.setText("Anna Salvador i Casals");
		txtNom.setForeground(Color.ORANGE);
		txtNom.setBackground(Color.RED);
		txtNom.setFont(new Font("Arial", 0, 12));
		txtNom.setSize(300, 100);
		
		marText.add(txtNom);
		finestra.add("South", marText);
		
		finestra.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FinestraHola();
	}
}
