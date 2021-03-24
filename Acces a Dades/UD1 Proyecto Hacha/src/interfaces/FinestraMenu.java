package interfaces;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FinestraMenu {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinestraMenu window = new FinestraMenu();
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
	public FinestraMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 321, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton botoUnir = new JButton("Unir Arxius");
		botoUnir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FinestraUnir a = new FinestraUnir();
				a.frmUnir.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		botoUnir.setBounds(10, 196, 279, 65);
		frame.getContentPane().add(botoUnir);
		
		JButton botDividir = new JButton("Dividir Arxiu");
		botDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FinestraDividir a = new FinestraDividir();
				a.frmFinestraDividir.setVisible(true);
				frame.setVisible(false);
			}
		});
		botDividir.setBounds(10, 87, 279, 65);
		frame.getContentPane().add(botDividir);
	}
}
