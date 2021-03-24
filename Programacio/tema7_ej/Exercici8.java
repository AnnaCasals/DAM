package tema7_ej;
import javax.swing.*;

public class Exercici8 {
	public static void main(String[] args) {
		// Crea la finestra amb el nom d'aquesta
		JFrame frame = new JFrame("Ventana Hola Mundo");

		// La finestra és visible
		frame.setVisible(true);
		
		// Quan tanquem l'aplicació (amb la x) que es tanque la finestra
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// Creem un 'label' que diga "Hola Mundo"
		JLabel label = new JLabel("Hola Mundo");
		
		// 
		frame.getContentPane().add(label);
		
		//
		frame.pack();
		
		//
		frame.setLocationRelativeTo(null);
		
	}
}
