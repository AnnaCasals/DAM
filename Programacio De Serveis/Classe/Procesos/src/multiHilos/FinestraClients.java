package multiHilos;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FinestraClients {

	private JFrame frame;
	private JTextField txtEnvia;
	private JTextField txtReb;
	
	PrintWriter fsalida;
	BufferedReader fentrada;
	//BufferedReader in;
	
	String envia;
	String reb;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinestraClients window = new FinestraClients();
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
	public FinestraClients() {
		initialize();
		
		String Host = "localhost";
		int Puerto = 4444;// puerto remoto
		try {
			Socket Cliente = new Socket(Host, Puerto);
			fsalida = new PrintWriter (Cliente.getOutputStream(), true);
			fentrada =  new BufferedReader(new InputStreamReader(Cliente.getInputStream()));
			//in = new BufferedReader(new InputStreamReader(System.in));
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 454, 193);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEscribeTexto = new JLabel("Escribe texto: ");
		lblEscribeTexto.setBounds(10, 15, 96, 14);
		frame.getContentPane().add(lblEscribeTexto);
		
		txtEnvia = new JTextField();
		txtEnvia.setBounds(10, 61, 299, 20);
		frame.getContentPane().add(txtEnvia);
		txtEnvia.setColumns(10);
		
		txtReb = new JTextField();
		txtReb.setEditable(false);
		txtReb.setBounds(10, 111, 299, 20);
		frame.getContentPane().add(txtReb);
		txtReb.setColumns(10);
		
		JButton bEnviar = new JButton("Enviar");
		bEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				envia = txtEnvia.getText();
				fsalida.println(envia);
				try {
					reb = fentrada.readLine();
					txtReb.setText(reb);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		bEnviar.setBounds(339, 15, 89, 23);
		frame.getContentPane().add(bEnviar);
		
		JButton bSalir = new JButton("Salir");
		bSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				envia = "*";
				try {
					fsalida.close();
					fentrada.close();
					
					System.exit(0);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		bSalir.setBounds(339, 60, 89, 23);
		frame.getContentPane().add(bSalir);
		
		JButton bLimpiar = new JButton("Limpiar");
		bLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtEnvia.setText("");
				txtReb.setText("");
			}
		});
		bLimpiar.setBounds(339, 110, 89, 23);
		frame.getContentPane().add(bLimpiar);
	}
}
