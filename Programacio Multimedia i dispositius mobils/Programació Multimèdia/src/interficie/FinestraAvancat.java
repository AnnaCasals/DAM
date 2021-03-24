package interficie;

import javax.swing.*;
import java.awt.*;

public class FinestraAvancat {
	JFrame finestra = new JFrame();
	
	JPanel martxt = new JPanel();
	JPanel marBoto = new JPanel();
	
	JTextField txt = new JTextField();
	JButton botoAcceptar = new JButton();
	
	FinestraAvancat() {
		finestra.setSize(500, 100);
		finestra.setLocationRelativeTo(null);
		finestra.setLayout(new BorderLayout());
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		finestra.setTitle("Avançat");
		
		txt.setSize(new Dimension(400, 100));
		txt.setFont(new Font("Arial", 0, 12));
		
		botoAcceptar.setText("Acceptar");
		botoAcceptar.setSize(new Dimension(300, 100));
		botoAcceptar.addActionListener(new Acceptar(txt));
		botoAcceptar.setIcon(new ImageIcon("src/Recursos/Aceptar.gif"));
		
		finestra.add("North", txt);
		finestra.add("South", botoAcceptar);
		finestra.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FinestraAvancat();
	}
}
