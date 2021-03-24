package ud1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FinestraUD1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinestraUD1 window = new FinestraUD1();
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
	public FinestraUD1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setTitle("Ventana");
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setBounds(10, 34, 165, 94);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnAcceptar = new JButton("Acceptar");
		btnAcceptar.setBounds(48, 137, 89, 23);
		frame.getContentPane().add(btnAcceptar);
		btnAcceptar.addActionListener(new Acceptar(textField));
		
		JLabel lbl = new JLabel("Escriu alguna cosa");
		lbl.setBounds(10, 11, 181, 14);
		frame.getContentPane().add(lbl);
	}
}
