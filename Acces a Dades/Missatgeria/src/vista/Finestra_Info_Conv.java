package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.List;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import controlador.*;

public class Finestra_Info_Conv extends JDialog {
	private JTextField txtNom;
	ArrayList<Object[]> usuaris = new ArrayList<Object[]>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Finestra_Info_Conv dialog = new Finestra_Info_Conv();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Finestra_Info_Conv() {
		Object[] conversa = Controlador.getConversa();
		
		setBounds(100, 100, 384, 435);
		getContentPane().setLayout(null);
		
		JLabel lblIdConversa = new JLabel("Id Conversa");
		lblIdConversa.setBounds(10, 11, 84, 14);
		getContentPane().add(lblIdConversa);
		
		JLabel lblId = new JLabel("");
		lblId.setBounds(104, 11, 52, 14);
		getContentPane().add(lblId);
		lblId.setText(String.valueOf(conversa[0]));
		
		JLabel lblTitol = new JLabel("T\u00EDtol");
		lblTitol.setBounds(10, 61, 46, 14);
		getContentPane().add(lblTitol);
		
		txtNom = new JTextField();
		txtNom.setEditable(false);
		txtNom.setBounds(104, 58, 219, 20);
		getContentPane().add(txtNom);
		txtNom.setColumns(10);
		txtNom.setText((String) conversa[4]);
		
		JLabel lblNusuaris = new JLabel("N\u00FAm.Usuaris");
		lblNusuaris.setBounds(10, 161, 61, 14);
		getContentPane().add(lblNusuaris);
		
		JLabel lblUsuaris = new JLabel("");
		lblUsuaris.setBounds(104, 161, 46, 14);
		getContentPane().add(lblUsuaris);
		lblUsuaris.setText(String.valueOf((int) conversa[3]));
		
		JButton bAtras = new JButton("<");
		bAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finestra_Converses a = new Finestra_Converses();
				a.setVisible(true);
				setVisible(false);
			}
		});
		bAtras.setBounds(10, 362, 89, 23);
		getContentPane().add(bAtras);
		
		JButton btnCanviar = new JButton("Canviar");
		btnCanviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnCanviar.getText().equals("Canviar")) {
					btnCanviar.setText("OK");
					txtNom.setEditable(true);
				} else {
					btnCanviar.setText("Canviar");
					String a = txtNom.getText();
					Controlador.canviaTitol(a);
					txtNom.setEditable(false);
				}
			}
		});
		btnCanviar.setBounds(234, 104, 89, 23);
		getContentPane().add(btnCanviar);
		
		List llistaUsuaris = new List();
		llistaUsuaris.setEnabled(false);
		llistaUsuaris.setBounds(104, 194, 219, 130);
		getContentPane().add(llistaUsuaris);
		
		String nom = "";
		usuaris = Controlador.usuarisConversa();
		for(int i = 0; i < usuaris.size(); i++) {
			nom = usuaris.get(i)[0] + " -> " + usuaris.get(i)[1];
			llistaUsuaris.add(nom);
			nom = "";
		}
	}
}
