package interficie;

import javax.swing.*;
import java.awt.*;

public class FinestraNIF {
	JFrame miVentana = new JFrame();
	
	JPanel marPrincipal = new JPanel();
	
	JLabel etiDNI = new JLabel("DNI");
	JLabel etiNIF = new JLabel("NIF");
	
	JTextField txtDNI = new JTextField();
	
	JButton botCalc = new JButton();
	private final JLabel etiRes = new JLabel("");
	
	FinestraNIF() {
		miVentana.setTitle("NIF");
		miVentana.setSize(250, 250);
		miVentana.setResizable(false);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.getContentPane().setLayout(new BorderLayout());
		marPrincipal.setLayout(null);
		etiDNI.setBounds(23, 21, 37, 14);
		
		marPrincipal.add(etiDNI);
		txtDNI.setBounds(70, 18, 124, 20);
		marPrincipal.add(txtDNI);
		etiNIF.setBounds(23, 136, 37, 14);
		marPrincipal.add(etiNIF);
		botCalc.setText("Calcular");
		botCalc.setBounds(70, 73, 124, 29);
		botCalc.addActionListener(new CalcDNI(txtDNI, etiRes));
		
		marPrincipal.add(botCalc);
		miVentana.getContentPane().add(marPrincipal);
		etiRes.setBounds(70, 136, 124, 14);
		
		marPrincipal.add(etiRes);
		miVentana.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FinestraNIF();
	}
}
