package ud1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ventana {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
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
	public Ventana() {
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
		frame.setLocationRelativeTo(null);
		
		JLabel lblEscriuAlgunaCosa = new JLabel("Escriu alguna cosa...");
		lblEscriuAlgunaCosa.setBounds(10, 11, 132, 14);
		frame.getContentPane().add(lblEscriuAlgunaCosa);
		
		textField = new JTextField();
		textField.setBounds(10, 45, 168, 73);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnAcceptar = new JButton("Acceptar");
		btnAcceptar.setBounds(10, 137, 168, 23);
		frame.getContentPane().add(btnAcceptar);
		btnAcceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, textField.getText());
				
			}
		});
	}
}
