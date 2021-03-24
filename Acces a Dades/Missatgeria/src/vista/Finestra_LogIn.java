package vista;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import controlador.*;

public class Finestra_LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField txtNom;
	private JPasswordField txtContrasenya;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra_LogIn frame = new Finestra_LogIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Finestra_LogIn() {
		setTitle("Entrar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 300);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 343, 193);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(24, 38, 46, 14);
		panel.add(lblNom);
		
		txtNom = new JTextField();
		txtNom.setBounds(121, 35, 196, 20);
		panel.add(txtNom);
		txtNom.setColumns(10);
		
		JLabel lblContrasenya = new JLabel("Contrasenya");
		lblContrasenya.setBounds(24, 105, 74, 14);
		panel.add(lblContrasenya);
		
		txtContrasenya = new JPasswordField();
		txtContrasenya.setBounds(121, 102, 196, 20);
		panel.add(txtContrasenya);
		txtContrasenya.setColumns(10);
		
		JButton bRegistrarse = new JButton("Registrar-se");
		bRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controlador.registre(txtNom.getText(), txtContrasenya.getText());
			}
		});
		bRegistrarse.setBounds(31, 227, 115, 23);
		contentPane.add(bRegistrarse);
		
		JButton bEntrar = new JButton("Entrar");
		bEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controlador.logIn(txtNom.getText(), txtContrasenya.getText());
				int id = Controlador.idUsuari(txtNom.getText(), txtContrasenya.getText());
				Controlador.setIdUsuari(id);
				Finestra_Converses a = new Finestra_Converses();
				a.setVisible(true);
				setVisible(false);
			}
		});
		bEntrar.setBounds(209, 227, 107, 23);
		contentPane.add(bEntrar);
	}
}
