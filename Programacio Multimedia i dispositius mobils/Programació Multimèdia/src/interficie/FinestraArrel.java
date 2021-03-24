package interficie;

import java.awt.*;
import javax.swing.*;

public class FinestraArrel {
	JFrame finestra = new JFrame();
	private final JPanel marPrincipal = new JPanel();
	private final JPanel marSuperior = new JPanel();
	private final JPanel marResultat = new JPanel();
	private final JPanel marNumeros = new JPanel();
	private final JButton botCalcular = new JButton("");
	private final JLabel etiNumero = new JLabel("Introduce un n\u00FAmero");
	private final JTextField txtNumero = new JTextField();
	private final JLabel etiArrel = new JLabel("");
	private final JLabel etiResultat = new JLabel("");
	
	FinestraArrel() {
		txtNumero.setBounds(10, 54, 143, 20);
		txtNumero.setColumns(10);
		finestra.setSize(347, 248);
		finestra.setLocationRelativeTo(null);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		finestra.setTitle("Arrel");
		finestra.getContentPane().setLayout(null);
		marPrincipal.setBounds(0, 0, 334, 254);
		
		finestra.getContentPane().add(marPrincipal);
		marPrincipal.setLayout(null);
		marSuperior.setBounds(10, 11, 314, 135);
		
		marPrincipal.add(marSuperior);
		marSuperior.setLayout(null);
		marNumeros.setBounds(10, 11, 184, 124);
		
		marSuperior.add(marNumeros);
		marNumeros.setLayout(null);
		etiNumero.setBounds(10, 11, 153, 32);
		
		marNumeros.add(etiNumero);
		
		marNumeros.add(txtNumero);
		botCalcular.setBounds(206, 11, 98, 124);
		botCalcular.addActionListener(new CalArrel(txtNumero, etiResultat));
		botCalcular.setIcon(new ImageIcon("src/Recursos/calculadora.gif"));
		
		marSuperior.add(botCalcular);
		marResultat.setBounds(10, 152, 314, 48);
		
		marPrincipal.add(marResultat);
		marResultat.setLayout(null);
		etiArrel.setBounds(10, 11, 130, 14);
		etiArrel.setText("Raiz cuadrada: ");
		
		marResultat.add(etiArrel);
		etiResultat.setBounds(173, 11, 131, 14);
		
		marResultat.add(etiResultat);
		finestra.setVisible(true);
		
	}
	public static void main(String[] args) {
		new FinestraArrel();
	}
}
