package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.image.AreaAveragingScaleFilter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import codi.UnirCodigo;

public class FinestraUnir extends UnirCodigo{

	JFrame frmUnir;
	ArrayList<File> llistaFitxers = new ArrayList<File>();
	File archivo;
	String text = "";

	
	/**
	 * Launch the application.
	 */
	//Creat automàticament
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinestraUnir window = new FinestraUnir();
					window.frmUnir.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the application.
	 */
	//Creat automàticament
	public FinestraUnir() {
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	//El Window Builder crea el codi de les propietats dels objectes automàticament
	private void initialize() {
		frmUnir = new JFrame();
		frmUnir.setTitle("Finestra Unir");
		frmUnir.setBounds(100, 100, 491, 333);
		frmUnir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUnir.getContentPane().setLayout(null);
		frmUnir.setResizable(false);
		
		JButton btnUnir = new JButton("Unir");
		btnUnir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					//Cridem al mètode per a unir l'arxiu
					new UnirCodigo();
					unir(llistaFitxers);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnUnir.setBounds(145, 267, 89, 23);
		frmUnir.getContentPane().add(btnUnir);
		
		JList llista = new JList();
		llista.setBounds(10, 11, 380, 245);
		frmUnir.getContentPane().add(llista);
		DefaultListModel<String> modelo = new DefaultListModel<String>();
		
		JButton btnAfegir = new JButton("");
		btnAfegir.setIcon(new ImageIcon(FinestraUnir.class.getResource("/com/sun/java/swing/plaf/windows/icons/UpFolder.gif")));
		btnAfegir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Per a que l'usuari puga elegir l'arxiu "visualment"
				JFileChooser a = new JFileChooser();
				a.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int resultado = a.showDialog(a, "Acceptar");
				
				//Afegim l'arxiu triat per l'usuari a l' ArrayList
				llistaFitxers.add(a.getSelectedFile());
				if((a.getSelectedFile() == null) || (a.getSelectedFile().getName().contentEquals(""))) {
					System.out.println("Error en l'arxiu");
				}
				
				//L'afegim a la llista
				modelo.addElement(a.getSelectedFile().getAbsolutePath());
				llista.setModel(modelo);
			}
		});
		
		btnAfegir.setBounds(400, 11, 70, 35);
		frmUnir.getContentPane().add(btnAfegir);
		
		JButton btnMen = new JButton("Men\u00FA");
		btnMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FinestraMenu a = new FinestraMenu();
				a.frame.setVisible(true);
				frmUnir.setVisible(false);
			}
		});
		btnMen.setBounds(387, 270, 83, 23);
		frmUnir.getContentPane().add(btnMen);
		
	}
}
