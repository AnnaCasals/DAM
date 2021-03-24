package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;

public class Taula {

	private JFrame frame;
	private JTable taula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Taula window = new Taula();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Taula() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		taula = new JTable();
		taula.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(taula);
	}
}
