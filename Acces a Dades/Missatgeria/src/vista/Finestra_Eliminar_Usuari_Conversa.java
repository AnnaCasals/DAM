package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import java.awt.List;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import controlador.*;

public class Finestra_Eliminar_Usuari_Conversa extends JDialog {
	ArrayList<Object[]> usuaris = new ArrayList<Object[]>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Finestra_Eliminar_Usuari_Conversa dialog = new Finestra_Eliminar_Usuari_Conversa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Finestra_Eliminar_Usuari_Conversa() {
		setBounds(100, 100, 418, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JButton bAtras = new JButton("<");
		bAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finestra_Conversa a = new Finestra_Conversa();
				a.setVisible(true);
				setVisible(false);
			}
		});
		bAtras.setBounds(10, 227, 57, 23);
		getContentPane().add(bAtras);
		
		List llistaUsuaris = new List();
		llistaUsuaris.setMultipleSelections(false);
		llistaUsuaris.setBounds(10, 10, 362, 211);
		getContentPane().add(llistaUsuaris);
		
		String usuari = "";
		usuaris = Controlador.usuarisConversa();
		for(int i = 0; i < usuaris.size(); i++) {
			usuari = usuaris.get(i)[0] + " -> " + usuaris.get(i)[1];
			llistaUsuaris.addItem(usuari);
			usuari = "";
		}
		
		JButton bEliminar = new JButton("Eliminar");
		bEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int item = llistaUsuaris.getSelectedIndex();
				int id = (int) usuaris.get(item)[0];
				Controlador.enviarDelGrup(id);
				JOptionPane.showMessageDialog(null, "El usuari ja està eliminat");
				Finestra_Conversa a = new Finestra_Conversa();
				a.setVisible(true);
				setVisible(false);
			}
		});
		bEliminar.setBounds(99, 227, 76, 23);
		getContentPane().add(bEliminar);
	}
}
