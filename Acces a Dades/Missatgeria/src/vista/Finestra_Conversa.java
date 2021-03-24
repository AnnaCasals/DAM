package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controlador.*;

public class Finestra_Conversa extends JDialog {
	static Object[] conversa = new Object[5];
	ArrayList<Object[]> missatges = new ArrayList<Object[]>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Finestra_Conversa dialog = new Finestra_Conversa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Finestra_Conversa() {
		setBounds(100, 100, 435, 365);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);	
		
		JLabel lblTitolConversa = new JLabel("");
		lblTitolConversa.setBounds(10, 11, 382, 14);
		getContentPane().add(lblTitolConversa);
		int i = Finestra_Converses.getItem();
		String titol = Controlador.titolConversaActual();
		lblTitolConversa.setText(titol);
		
		List llistaMissatges = new List();
		llistaMissatges.setMultipleSelections(false);
		llistaMissatges.setBounds(10, 31, 382, 200);
		getContentPane().add(llistaMissatges);
		
		String text = "";
		missatges = Controlador.missatges();
		for(int j = 0; j < missatges.size(); j++) {
			text = (String) missatges.get(j)[1];
			llistaMissatges.addItem(text);
			text = "";
		}
		
		JButton bAtras = new JButton("<");
		bAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finestra_Converses a = new Finestra_Converses();
				a.setVisible(true);
				setVisible(false);
			}
		});
		bAtras.setBounds(10, 292, 60, 23);
		getContentPane().add(bAtras);
		
		JButton bBorrar = new JButton("Borrar Missatge");
		bBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int item = llistaMissatges.getSelectedIndex();
				int id = (int) missatges.get(item)[0];
				if(Controlador.borrarMissatge(id)) {
					llistaMissatges.remove(item);
					missatges.remove(item);
				} else {
					JOptionPane.showMessageDialog(null, "Aquest missatge no ha sigut enviat per tu, l'ha de borrar qui l'ha escrit!!!");
				}
			}
		});
		bBorrar.setBounds(153, 246, 107, 23);
		getContentPane().add(bBorrar);
		
		JButton bEnviar = new JButton("Enviar Missatge");
		bEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = JOptionPane.showInputDialog("Missatge: ");
				Controlador.enviarMissatge(text);
				
				String s = "";
				llistaMissatges.clear();
				missatges = Controlador.missatges();
				for(int j = 0; j < missatges.size(); j++) {
					s = (String) missatges.get(j)[1];
					llistaMissatges.addItem(s);
					text = "";
				}
			}
		});
		bEnviar.setBounds(21, 246, 107, 23);
		getContentPane().add(bEnviar);
		
		
		JButton bAfegirUsuari = new JButton("Afegir Usuari");
		bAfegirUsuari.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Finestra_Afegir_Usuari a = new Finestra_Afegir_Usuari();
				a.setVisible(true);
				setVisible(false);
			}
		});
		bAfegirUsuari.setBounds(285, 246, 107, 23);
		getContentPane().add(bAfegirUsuari);
	}
}
