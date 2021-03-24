package interficie;

import javax.swing.*;
import javax.swing.plaf.BorderUIResource.EtchedBorderUIResource;

import java.awt.*;

public class FinestraDividir {
	JFrame miVentana = new JFrame();
	
	JPanel marPrincipal = new JPanel();
	JPanel marSuperior = new JPanel();
	JPanel marOperandos = new JPanel();
	JPanel marDividendo = new JPanel();
	JPanel marDivisor = new JPanel();
	
	JButton botCalcular = new JButton();
	JLabel etiCociente = new JLabel("Cociente");
	private JTextField txtDividendo;
	private JTextField txtDivisor;
	private final JLabel etiResultat = new JLabel("");
	
	FinestraDividir() {
		miVentana.setSize(461, 316);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setTitle("Dividir");
		miVentana.getContentPane().setLayout(null);
		
		marPrincipal.setBounds(0, 0, 435, 260);
		miVentana.getContentPane().add(marPrincipal);
		marPrincipal.setLayout(null);
		marSuperior.setBounds(0, 0, 425, 191);
		marPrincipal.add(marSuperior);
		marSuperior.setLayout(null);
		marOperandos.setBounds(10, 11, 245, 166);
		marSuperior.add(marOperandos);
		marOperandos.setLayout(null);
		
		marDividendo.setBounds(10, 23, 225, 46);
		marOperandos.add(marDividendo);
		
		marDivisor.setBounds(10, 86, 225, 46);
		marOperandos.add(marDivisor);
		marDivisor.setLayout(null);
		
		JLabel etiDivisor = new JLabel("Divisor");
		etiDivisor.setBounds(10, 11, 46, 14);
		marDivisor.add(etiDivisor);
		
		txtDivisor = new JTextField();
		txtDivisor.setBounds(90, 11, 125, 14);
		marDivisor.add(txtDivisor);
		txtDivisor.setColumns(10);
		marDividendo.setLayout(null);
		
		JLabel etiDividendo = new JLabel("Dividendo");
		etiDividendo.setBounds(10, 11, 72, 14);
		marDividendo.add(etiDividendo);
		
		txtDividendo = new JTextField();
		txtDividendo.setBounds(92, 8, 123, 20);
		marDividendo.add(txtDividendo);
		txtDividendo.setColumns(10);
		
		botCalcular.setBounds(307, 23, 98, 124);
		botCalcular.setIcon(new ImageIcon("src/Recursos/calculadora.gif"));
		botCalcular.addActionListener(new Dividir(txtDividendo, txtDivisor, etiResultat));
		
		marSuperior.add(botCalcular);
		
		JPanel marInferior = new JPanel();
		marInferior.setBounds(10, 209, 415, 42);
		marPrincipal.add(marInferior);
		marInferior.setLayout(null);
		etiCociente.setBounds(27, 11, 82, 14);
		marInferior.add(etiCociente);
		etiResultat.setBounds(165, 11, 146, 14);
		
		marInferior.add(etiResultat);
		
		miVentana.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FinestraDividir();
	}
}
