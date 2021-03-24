package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn {

	private JFrame frame;
	private JTextField txtusuari;
	private JPasswordField txtContrasenya;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
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
	public LogIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 338, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIniciarSessi = new JLabel("Iniciar Sessi\u00F3");
		lblIniciarSessi.setHorizontalAlignment(SwingConstants.CENTER);
		lblIniciarSessi.setBounds(50, 11, 216, 14);
		frame.getContentPane().add(lblIniciarSessi);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 66, 46, 14);
		frame.getContentPane().add(lblUsuario);
		
		JLabel lblContrasenya = new JLabel("Contrasenya");
		lblContrasenya.setBounds(10, 122, 72, 14);
		frame.getContentPane().add(lblContrasenya);
		
		JLabel lblNivellDeSeguretat = new JLabel("Nivell de Seguretat");
		lblNivellDeSeguretat.setBounds(10, 179, 99, 14);
		frame.getContentPane().add(lblNivellDeSeguretat);
		
		txtusuari = new JTextField();
		txtusuari.setBounds(138, 63, 128, 20);
		frame.getContentPane().add(txtusuari);
		txtusuari.setColumns(10);
		
		JSpinner spinnerNivell = new JSpinner();
		spinnerNivell.setBounds(138, 176, 29, 20);
		frame.getContentPane().add(spinnerNivell);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				baseDeDades.Connexio.connectar();
				baseDeDades.Connexio.insertar(txtusuari.getText(), txtContrasenya.getText(), spinnerNivell.getValue().toString());
				baseDeDades.Connexio.desconnectar();
			}
		});
		btnRegistrar.setBounds(50, 261, 89, 23);
		frame.getContentPane().add(btnRegistrar);
		
		txtContrasenya = new JPasswordField();
		txtContrasenya.setBounds(138, 119, 128, 20);
		frame.getContentPane().add(txtContrasenya);
		txtContrasenya.setColumns(10);
		
		JButton Comprovar = new JButton("Comprovar");
		Comprovar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean a;
				baseDeDades.Connexio.connectar();
				a = baseDeDades.Connexio.llegir(txtusuari.getText(), txtContrasenya.getText());
				if(a) {
					JOptionPane.showMessageDialog(null, "L'usuari és CORRECTE");
				} else {
					JOptionPane.showMessageDialog(null, "L'usuari i/o contrasenya no són correctes. NO EXISTEIXEN");
				}
				baseDeDades.Connexio.desconnectar();
			}
		});
		Comprovar.setBounds(155, 261, 89, 23);
		frame.getContentPane().add(Comprovar);
	}
}
