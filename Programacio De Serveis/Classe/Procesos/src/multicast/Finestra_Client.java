package multicast;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.List;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finestra_Client {

	private JFrame frame;
	int Puerto = 12345;//Puerto multicast
	MulticastSocket ms;  
	InetAddress grupo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra_Client window = new Finestra_Client();
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
	public Finestra_Client() {
		initialize();
		
		 try {
			ms = new MulticastSocket(Puerto);
			grupo = InetAddress.getByName("225.0.0.1");//Grupo
			ms.joinGroup (grupo);
			
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
		
		List list = new List();
		list.setBounds(10, 10, 305, 241);
		frame.getContentPane().add(list);
		//Afegir mensaje
		String msg="";
		byte[] buf = new byte[1024];
		//Recibe el paquete del servidor multicast      
		DatagramPacket paquete = new DatagramPacket(buf, buf.length);
		try {
			ms.receive(paquete);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(NullPointerException npe) {
			npe.printStackTrace();
		}

		msg = new String(paquete.getData());
		list.add("Recibo ==> " + msg);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ms.leaveGroup (grupo);
					ms.close (); //cierra socket

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSalir.setBounds(335, 54, 89, 23);
		frame.getContentPane().add(btnSalir);
	}

}
