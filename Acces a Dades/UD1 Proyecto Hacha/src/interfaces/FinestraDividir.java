package interfaces;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import codi.CrearXML;
import codi.DividirCodigo;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTree;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.SpinnerNumberModel;
import codi.CrearXML;

public class FinestraDividir extends DividirCodigo {
	JFrame frmFinestraDividir;
	public File archivo;
	public static int partes;

	/**
	 * Launch the application.
	 */
	//Creat automàticament
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinestraDividir window = new FinestraDividir();
					window.frmFinestraDividir.setVisible(true);
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
	public FinestraDividir() {
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	//El Window Builder crea el codi de les propietats dels objectes automàticament
	private void initialize() {
		frmFinestraDividir = new JFrame();
		frmFinestraDividir.setTitle("Finestra Dividir");
		frmFinestraDividir.setBounds(100, 100, 348, 344);
		frmFinestraDividir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFinestraDividir.getContentPane().setLayout(null);
		frmFinestraDividir.setResizable(false);
		
		JLabel lblBuscarArxius = new JLabel("Buscar arxiu...");
		lblBuscarArxius.setBounds(10, 46, 101, 22);
		frmFinestraDividir.getContentPane().add(lblBuscarArxius);
		
		JSpinner spinnerParts = new JSpinner();
		spinnerParts.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerParts.setBounds(144, 210, 29, 20);
		frmFinestraDividir.getContentPane().add(spinnerParts);
		
		JLabel lblParts = new JLabel("Parts:");
		lblParts.setBounds(50, 213, 46, 14);
		frmFinestraDividir.getContentPane().add(lblParts);
		
		JButton btnDividir = new JButton("Dividir");
		//Quan hi ha algun canvi d'estat en el botó Dividir(en aquest cas, quan es polsa) 
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Per saber en quantes parts ha decidit l'usuari dividir l'arxiu seleccionat
				partes = Integer.parseInt(spinnerParts.getModel().getValue().toString());
				
				try {
					//Cridem a la classe que divideix el codi
					new DividirCodigo();
					dividir(archivo, partes);
					//Creem l'arxiu xml, amb les parts i la longitut de l'arxiu
					codi.CrearXML.crear(partes, archivo);
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		btnDividir.setBounds(50, 265, 89, 23);
		frmFinestraDividir.getContentPane().add(btnDividir);
		
		JLabel lblarxiuTriats = new JLabel("L'arxiu triat \u00E9s: ");
		lblarxiuTriats.setBounds(10, 112, 117, 14);
		frmFinestraDividir.getContentPane().add(lblarxiuTriats);
		
		JLabel lblFitxer = new JLabel("");
		lblFitxer.setBounds(10, 137, 322, 14);
		frmFinestraDividir.getContentPane().add(lblFitxer);
		
		JButton btnBuscar = new JButton("");
		btnBuscar.setIcon(new ImageIcon(FinestraDividir.class.getResource("/javax/swing/plaf/metal/icons/ocean/newFolder.gif")));
		btnBuscar.setBounds(201, 41, 59, 27);
		btnBuscar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//Per a que l'usuari puga elegir l'arxiu "visualment"
				JFileChooser a = new JFileChooser();
				a.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int resultado = a.showDialog(a, "Acceptar");
				archivo = a.getSelectedFile();
				if((archivo == null) || (archivo.getName().contentEquals(""))) {
					lblFitxer.setText("Arxiu invàlid");
				}
				lblFitxer.setText(archivo.getAbsolutePath());
			}
		});
		
		frmFinestraDividir.getContentPane().add(btnBuscar);
		
		JButton btnMen = new JButton("Men\u00FA");
		btnMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FinestraMenu a = new FinestraMenu();
				a.frame.setVisible(true);
				frmFinestraDividir.setVisible(false);
			}
		});
		btnMen.setBounds(243, 281, 89, 23);
		frmFinestraDividir.getContentPane().add(btnMen);
	}
}
