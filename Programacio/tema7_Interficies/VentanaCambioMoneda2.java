package tema7_Interficies;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaCambioMoneda2 {
	JFrame miVentana = new JFrame();
	JPanel marEuros = new JPanel();
	JPanel marDolares = new JPanel();
	JPanel marBotones = new JPanel();
	JPanel marPrincipal = new JPanel();
	JLabel etiEuros = new JLabel();
	JLabel etiDolares = new JLabel();
	JTextField txtEuros = new JTextField();
	JTextField txtDolares = new JTextField();
	JButton botCalcEuroDolar = new JButton();
	JButton botCalcDolarEuro = new JButton();
	
	public VentanaCambioMoneda2() {
		miVentana.setSize(600, 100);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new BorderLayout());
		
		txtEuros.setFont(new Font("Arial", 0,12));
		txtEuros.setHorizontalAlignment(JTextField.CENTER);
		txtEuros.setPreferredSize(new Dimension(100, 25));
		
		txtDolares.setFont(new Font("Arial", 0,12));
		txtDolares.setHorizontalAlignment(JTextField.CENTER);
		txtDolares.setPreferredSize(new Dimension(100, 25));
		
		etiEuros.setText("Euros (€)");
		etiEuros.setFont(new Font("Arial", 0,14));
		etiEuros.setForeground(Color.blue);
		etiEuros.setPreferredSize(new Dimension(80, 25));
		etiEuros.setHorizontalAlignment(JTextField.CENTER);
		etiEuros.setVerticalAlignment(JTextField.TOP);
		
		etiDolares.setText("Dolares ($)");
		etiDolares.setFont(new Font("Arial", 0,14));
		etiDolares.setForeground(Color.BLUE);
		etiDolares.setPreferredSize(new Dimension(80, 25));
		etiDolares.setHorizontalAlignment(JTextField.CENTER);
		etiDolares.setVerticalAlignment(JTextField.TOP);
		
		botCalcEuroDolar.setIcon(new ImageIcon(getClass().getResource("Derecha.gif")));
		botCalcEuroDolar.setPreferredSize(new Dimension(50, 50));
		botCalcEuroDolar.addActionListener(new CalcEuroDolar2(txtEuros, txtDolares));
		
		botCalcDolarEuro.setIcon(new ImageIcon(getClass().getResource("Izquierda.gif")));
		botCalcDolarEuro.setPreferredSize(new Dimension(50, 50));
		botCalcDolarEuro.addActionListener(new CalcDolarEuro(txtDolares, txtEuros));
		
		marEuros.add(etiEuros);
		marEuros.add(txtEuros);
		
		marBotones.add("North", botCalcEuroDolar);
		marBotones.add("South", botCalcDolarEuro);
		
		marDolares.add(etiDolares);
		marDolares.add(txtDolares);
		
		marPrincipal.add(marEuros);
		marPrincipal.add(marBotones);
		marPrincipal.add(marDolares);
		
		
		miVentana.add(marPrincipal);
		miVentana.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new VentanaCambioMoneda2();
	}
}
