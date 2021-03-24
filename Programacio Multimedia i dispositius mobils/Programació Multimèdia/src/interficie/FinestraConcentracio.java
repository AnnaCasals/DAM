package interficie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FinestraConcentracio {
	JFrame finestra = new JFrame();
	
	JPanel marPrincipal = new JPanel();
	JPanel marEsquerre = new JPanel();
	JPanel marDret = new JPanel();
	private JTextField txtSolut;
	private final JTextField txtDisolucio = new JTextField();
	private final JLabel imgFormula = new JLabel("");
	private final JLabel imgConcentracio = new JLabel("");
	private final JLabel etiResultat = new JLabel("Concentraci\u00F3 (g/L)");
	private final JTextField txtResultat = new JTextField();
	
	public FinestraConcentracio() {
		txtResultat.setBounds(10, 180, 221, 20);
		txtResultat.setColumns(10);
		txtDisolucio.setBounds(187, 8, 125, 20);
		txtDisolucio.setColumns(10);
		// TODO Auto-generated constructor stub
		Font f = new Font("Arial", 0, 12);
		Dimension dim = new Dimension(25, 25);
		
		finestra.setSize(599, 250);
		finestra.setLocationRelativeTo(null);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//finestra.setResizable(false);
		finestra.setTitle("Concentració");
		
		marDret.setBounds(342, 0, 241, 211);
		marDret.setLayout(null);
		
		finestra.getContentPane().setLayout(null);
		
		marEsquerre.setBounds(0, 0, 342, 211);
		marEsquerre.setLayout(null);
		
		finestra.getContentPane().add(marEsquerre);
		
		JPanel marSolut = new JPanel();
		marSolut.setBounds(10, 28, 322, 33);
		marEsquerre.add(marSolut);
		marSolut.setLayout(null);
		
		JLabel etiSolut = new JLabel("Gramos de Soluto (g)");
		etiSolut.setBounds(10, 11, 128, 14);
		marSolut.add(etiSolut);
		
		imgFormula.setIcon(new ImageIcon("src/Recursos/formula.gif"));
		imgFormula.setPreferredSize(new Dimension(80, 70));
		imgFormula.setHorizontalAlignment(JLabel.CENTER);
		imgFormula.setVerticalAlignment(JLabel.CENTER);
		
		imgConcentracio.setIcon(new ImageIcon("src/Recursos/concentración.gif"));
		imgConcentracio.setPreferredSize(new Dimension(40, 40));
		imgConcentracio.setHorizontalAlignment(JLabel.CENTER);
		imgConcentracio.setVerticalAlignment(JLabel.CENTER);
		
		txtSolut = new JTextField();
		txtSolut.setBounds(184, 8, 128, 20);
		marSolut.add(txtSolut);
		txtSolut.setColumns(10);
		
		JPanel marDisolucio = new JPanel();
		marDisolucio.setBounds(10, 72, 322, 33);
		marEsquerre.add(marDisolucio);
		marDisolucio.setLayout(null);
		
		JLabel etiDisolucio = new JLabel("Volumen de Disolución (L)");
		etiDisolucio.setBounds(10, 11, 130, 14);
		marDisolucio.add(etiDisolucio);
		
		marDisolucio.add(txtDisolucio);
		
		JButton botoCalcular = new JButton("Calcular");
		botoCalcular.addActionListener(new Calcular(txtSolut, txtDisolucio, txtResultat));
		botoCalcular.setBounds(10, 116, 322, 33);
		botoCalcular.setIcon(new ImageIcon("src/Recursos/calculadora.gif"));
		marEsquerre.add(botoCalcular);
		imgFormula.setBounds(10, 160, 289, 40);
		
		marEsquerre.add(imgFormula);
		finestra.getContentPane().add(marDret);
		imgConcentracio.setBounds(10, 11, 255, 64);
		
		marDret.add(imgConcentracio);
		etiResultat.setBounds(10, 155, 255, 14);
		
		marDret.add(etiResultat);
		
		marDret.add(txtResultat);
		finestra.getContentPane().add(marPrincipal);
		
		finestra.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new FinestraConcentracio();
	}
}
