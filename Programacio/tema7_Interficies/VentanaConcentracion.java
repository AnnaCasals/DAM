package tema7_Interficies;

import java.awt.*;
import javax.swing.*;

public class VentanaConcentracion {
	JFrame miVentana = new JFrame();
	
	JPanel marPrincipal = new JPanel();
	JPanel marIzquierdo = new JPanel();
	JPanel marDerecho = new JPanel();
	JPanel marSoluto = new JPanel();
	JPanel marDisolucion = new JPanel();
	
	JLabel etiResultado = new JLabel();
	JLabel etiDisolucion = new JLabel();
	JLabel etiConcentracion = new JLabel();
	
	JLabel imgFormula = new JLabel();
	JLabel imgConcentracion = new JLabel();
	
	JButton botCalcular = new JButton();
	JButton botCalcular2 = new JButton();
	
	JTextField txtDisolucion = new JTextField();
	
	public VentanaConcentracion() { 
		imgFormula.setIcon(new ImageIcon(getClass().getResource("Formula.gif")));
	}
}
