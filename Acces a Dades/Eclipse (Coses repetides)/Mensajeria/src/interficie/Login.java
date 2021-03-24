package interficie;

import controlador.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField txtNom;
	private JTextField txtContrasenya;
	private static int idUsuari;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}
	
	public static int getidUsuari() { return idUsuari; }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 533, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(41, 109, 46, 14);
		frame.getContentPane().add(lblNom);
		
		JLabel lblContrasenya = new JLabel("Contrasenya");
		lblContrasenya.setBounds(41, 169, 73, 14);
		frame.getContentPane().add(lblContrasenya);
		
		txtNom = new JTextField();
		txtNom.setBounds(179, 106, 186, 20);
		frame.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		txtContrasenya = new JTextField();
		txtContrasenya.setBounds(179, 166, 186, 20);
		frame.getContentPane().add(txtContrasenya);
		txtContrasenya.setColumns(10);
		
		JButton bregistrar = new JButton("Registra't");
		bregistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controlador.registre(txtNom.getText(), txtContrasenya.getText());
			}
		});
		bregistrar.setBounds(276, 294, 89, 23);
		frame.getContentPane().add(bregistrar);
		
		JButton blogin = new JButton("LogIn");
		blogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controlador.logIn(txtNom.getText(), txtContrasenya.getText());
				idUsuari = Controlador.id(txtNom.getText(), txtContrasenya.getText());
				
				Conversa a = new Conversa();
				a.frmConversacions.setVisible(true);
				frame.setVisible(false);
			}
		});
		blogin.setBounds(98, 294, 89, 23);
		frame.getContentPane().add(blogin);
	}
}
