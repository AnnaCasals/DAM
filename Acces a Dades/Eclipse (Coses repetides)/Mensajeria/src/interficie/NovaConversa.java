package interficie;

import controlador.*;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JList;

import baseDeDades.DataIHora;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class NovaConversa {

	JFrame frame;
	DefaultListModel model = new DefaultListModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NovaConversa window = new NovaConversa();
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
	public NovaConversa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 593, 529);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JList llista = new JList();
		llista.setBounds(10, 59, 463, 391);
		frame.getContentPane().add(llista);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnOk.setBounds(483, 427, 84, 23);
		frame.getContentPane().add(btnOk);
		
		int id; 
		String nom;
		String l = "";
		ArrayList<Object[]> usuaris = Controlador.usuaris();
		for(int i = 0; i < usuaris.size(); i++) {
			id = (int) usuaris.get(i)[0];
			nom = (String) usuaris.get(i)[1];
			
			l += id + "	" + nom;
			model.addElement(l);
			l = "";	
		}
		llista.setModel(model);
		
		JLabel lblId = new JLabel("ID   NOM");
		lblId.setBounds(10, 34, 93, 14);
		frame.getContentPane().add(lblId);
	}
}
