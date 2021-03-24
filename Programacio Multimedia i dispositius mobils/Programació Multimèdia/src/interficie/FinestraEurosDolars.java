package interficie;

import javax.swing.*;
import java.awt.*;

public class FinestraEurosDolars {
	JFrame finestra = new JFrame();
	
	JPanel marEuros = new JPanel();
	JPanel marDolars = new JPanel();
	JPanel marBotons = new JPanel();
	JPanel marPrincipal = new JPanel();
	
	JButton botoCanvia = new JButton();
	
	JTextField txtDolars = new JTextField();
	JTextField txtEuros = new JTextField();
	
	JLabel etiEuros = new JLabel();
	JLabel etiDolars = new JLabel();
	
	FinestraEurosDolars() {
		finestra.setSize(500, 100);
		finestra.setLayout(new BorderLayout());
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		finestra.setLocationRelativeTo(null);
		finestra.setTitle("Canvi de moneda");
		
		etiEuros.setText("Euros €");
		etiEuros.setFont(new Font("Arial", 0, 12));
		etiEuros.setPreferredSize(new Dimension(50, 25));
		
		etiDolars.setText("Dolars $");
		etiDolars.setFont(new Font("Arial", 0, 12));
		etiDolars.setPreferredSize(new Dimension(50, 25));
		
		txtEuros.setFont(new Font("Arial", 0, 12));
		txtEuros.setHorizontalAlignment(JTextField.CENTER);
		txtEuros.setPreferredSize(new Dimension(50, 25));
		
		txtDolars.setFont(new Font("Arial", 0, 12));
		txtDolars.setHorizontalAlignment(JTextField.CENTER);
		txtDolars.setPreferredSize(new Dimension(50, 25));
		
		botoCanvia.setSize(new Dimension(25, 25));
		botoCanvia.addActionListener(new CalcEuroDolar(txtEuros, txtDolars));
		botoCanvia.setIcon(new ImageIcon("src/Recursos/flechaderecha.gif"));
		
		marBotons.add(botoCanvia);
		
		marEuros.add(etiEuros);
		marEuros.add(txtEuros);
		
		marDolars.add(etiDolars);
		marDolars.add(txtDolars);
		
		marPrincipal.add(marEuros);
		marPrincipal.add(marBotons);
		marPrincipal.add(marDolars);
		
		finestra.add(marPrincipal);
		finestra.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FinestraEurosDolars();
	}
}
