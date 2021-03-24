package interfaces;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Llista {

	private JFrame frame;
	ArrayList<Object[]> llistaProductes = new ArrayList<Object[]>();
	DefaultListModel modelo = new DefaultListModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Llista window = new Llista();
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
	public Llista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 657, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setBounds(10, 11, 495, 449);
		frame.getContentPane().add(list);
		list.setModel(modelo);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				baseDeDades.Connexio.connectar();
				llistaProductes = baseDeDades.Connexio.consulta();
				String b = " ";
				for(int i =  0; i < llistaProductes.size(); i++) {
					for(int j = 0; j < llistaProductes.get(i).length; j++) {
						b += (llistaProductes.get(i))[j] + " ";

					}
					modelo.addElement(b);
					b = " ";
				}
				baseDeDades.Connexio.desconnectar();
				
			}
		});
		btnMostrar.setBounds(529, 73, 89, 23);
		frame.getContentPane().add(btnMostrar);
	}
}
