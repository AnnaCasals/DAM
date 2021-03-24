package proves;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CanviMoneda {
	JFrame finestra = new JFrame();
	
	JPanel marEuros = new JPanel();
	JPanel marDolars = new JPanel();
	JPanel marBotons = new JPanel();
	JPanel marPrincipal = new JPanel();
	
	JButton canvia = new JButton();
	
	JTextField txtDolars = new JTextField();
	JTextField txtEuros = new JTextField();
	
	JLabel etiEuros = new JLabel();
	JLabel etiDolars = new JLabel();
	
	CanviMoneda(){
		
		finestra.setSize(900, 200);
		finestra.setLayout(new BorderLayout());
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		finestra.setLocationRelativeTo(null);
		
		txtEuros.setFont(new Font("Arial", 0, 12));
		txtEuros.setHorizontalAlignment(JTextField.CENTER);
		txtEuros.setPreferredSize(new Dimension(100, 25));
		
		txtDolars.setFont(new Font("Arial", 0, 12));
		txtDolars.setHorizontalAlignment(JTextField.CENTER);
		txtDolars.setPreferredSize(new Dimension(100, 25));
		
		etiEuros.setText("Euros €");
		etiEuros.setFont(new Font("Arial", 0, 14));
		etiEuros.setPreferredSize(new Dimension(100, 25));
		//etiEuros.setHorizontalAlignment(JTextField.CENTER);
		//etiEuros.setVerticalAlignment(JTextField.TOP);
		
		etiDolars.setText("Dolars $");
		etiDolars.setFont(new Font("Arial", 0, 14));
		etiDolars.setPreferredSize(new Dimension(100, 25));
		//etiDolars.setHorizontalAlignment(JTextField.CENTER);
		//etiDolars.setVerticalAlignment(JTextField.TOP);
		
		canvia.setSize(new Dimension(40, 40));
		canvia.setText("-->");
		canvia.addActionListener(new CalcEurDol(txtEuros, txtDolars));
		
		marEuros.add(etiEuros);
		marEuros.add(txtEuros);
		
		marBotons.add(canvia);
		
		marDolars.add(etiDolars);
		marDolars.add(txtEuros);
		
		marPrincipal.add(marEuros);
		marPrincipal.add(marBotons);
		marPrincipal.add(marDolars);
		
		finestra.add(marPrincipal);
		finestra.setVisible(true);
	}
	
	public static void main(String[] args) {
		new CanviMoneda();
	}
}
