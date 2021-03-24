package multicast;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.awt.event.ActionEvent;
import java.awt.List;

public class Finestra_Servidor {

	private JFrame frame;
	private JTextField txtMsj;
    BufferedReader in;
    MulticastSocket ms;
    int Puerto = 12345;//Puerto multicast
    InetAddress grupo ;//Grupo

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra_Servidor window = new Finestra_Servidor();
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
	public Finestra_Servidor() {
		initialize();
		
		in = new BufferedReader(new InputStreamReader(System.in));

		//Se crea el socket multicast. 
	    try {
			ms = new MulticastSocket();
			grupo = InetAddress.getByName("225.0.0.1");
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		    
	    
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtMsj = new JTextField();
		txtMsj.setToolTipText("Texto a enviar");
		txtMsj.setBounds(10, 11, 277, 20);
		frame.getContentPane().add(txtMsj);
		txtMsj.setColumns(10);
		
		JButton bEnviar = new JButton("Enviar");
		bEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cadena = txtMsj.getText();
				try {
					cadena = in.readLine();
					//Enviando al grupo
					DatagramPacket paquete = new DatagramPacket(cadena.getBytes(), cadena.length(), grupo, Puerto);
					ms.send (paquete); 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		bEnviar.setBounds(306, 10, 89, 23);
		frame.getContentPane().add(bEnviar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ms.close ();
			}
		});
		btnSalir.setBounds(306, 44, 89, 23);
		frame.getContentPane().add(btnSalir);
		
		List list = new List();
		list.setBounds(10, 44, 277, 196);
		frame.getContentPane().add(list);
	}
}
