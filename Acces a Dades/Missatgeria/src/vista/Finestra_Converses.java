package vista;

import java.util.*;
import javax.swing.*;

import controlador.*;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finestra_Converses extends JDialog {
	ArrayList<String> titols = new ArrayList<String>();
	static int item = -1;
	ArrayList<Object[]> converses = new ArrayList<Object[]>();
	
	public static int getItem() { return item; }
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Finestra_Converses dialog = new Finestra_Converses();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Finestra_Converses() {
		setBounds(100, 100, 419, 356);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		List llistaConverses = new List();
		llistaConverses.setMultipleSelections(false);
		llistaConverses.setBounds(30, 27, 345, 196);
		getContentPane().add(llistaConverses);
		
		String titol = "";
		converses = Controlador.converses();
		for(int i = 0; i < converses.size(); i++) {
			titol = (String) converses.get(i)[4];
			llistaConverses.addItem(titol);
			titol = "";
		}
		
		JButton bEixirConv = new JButton("Eixir de Conv.");
		bEixirConv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int item = llistaConverses.getSelectedIndex();
				int idConversa = (int) converses.get(item)[0];
				Controlador.exirDeConversa(idConversa);
				llistaConverses.remove(item);
				converses.remove(item);
			}
		});
		bEixirConv.setBounds(30, 243, 99, 23);
		getContentPane().add(bEixirConv);
		
		JButton btnMostrar = new JButton("Mostrar Conv.");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item = llistaConverses.getSelectedIndex();
				Controlador.setConversa(converses.get(item));
				Finestra_Conversa a = new Finestra_Conversa();
				a.setVisible(true);
				setVisible(false);
			}
		});
		btnMostrar.setBounds(139, 243, 108, 23);
		getContentPane().add(btnMostrar);
		
		JButton bNovaConv = new JButton("Nova Conv.");
		bNovaConv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String titol = JOptionPane.showInputDialog("Titol de la conversa");
				Controlador.insertarConversa(titol);
				llistaConverses.clear();
				converses = Controlador.converses();
				for(int i = 0; i < converses.size(); i++) {
					titol = (String) converses.get(i)[4];
					llistaConverses.addItem(titol);
					titol = "";
				}
			}
		});
		bNovaConv.setBounds(30, 283, 99, 23);
		getContentPane().add(bNovaConv);
		
		JButton bInfoConversa = new JButton("Info Conv.");
		bInfoConversa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				item = llistaConverses.getSelectedIndex();
				Controlador.setConversa(converses.get(item));
				Controlador.setIdConversa((int)converses.get(item)[0]);
				Finestra_Info_Conv a = new Finestra_Info_Conv();
				a.setVisible(true);
				setVisible(false);
			}
		});
		bInfoConversa.setBounds(267, 243, 108, 23);
		getContentPane().add(bInfoConversa);
	}
}
