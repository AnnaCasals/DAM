package interficie;

import java.awt.EventQueue;
import controlador.*;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conversa {

	JFrame frmConversacions;
	DefaultListModel<String> model = new DefaultListModel<String>();
	ArrayList<String> titols = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversa window = new Conversa();
					window.frmConversacions.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Conversa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversacions = new JFrame();
		frmConversacions.setTitle("Conversacions");
		frmConversacions.setBounds(100, 100, 672, 500);
		frmConversacions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConversacions.getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setBounds(10, 11, 513, 409);
		frmConversacions.getContentPane().add(list);
		
		
		JButton btnNova = new JButton("Nova");
		btnNova.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NovaConversa a = new NovaConversa();
				a.frame.setVisible(true);
				frmConversacions.setVisible(false);
			}
		});
		btnNova.setBounds(557, 397, 89, 23);
		frmConversacions.getContentPane().add(btnNova);
		
		String titol = "";
		titols = Controlador.converses2(Login.getidUsuari());
		for(int i = 0; i < titols.size(); i++) {
			titol = titols.get(i);
			model.addElement(titol);
			titol = "";
		}
		list.setModel(model);
	}
}
