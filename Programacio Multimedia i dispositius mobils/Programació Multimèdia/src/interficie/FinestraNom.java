package interficie;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FinestraNom {
JFrame finestra = new JFrame();
	
	JPanel martxt = new JPanel();
	JPanel marBoto = new JPanel();
	
	JTextField txt = new JTextField();
	JButton botoAcceptar = new JButton();
	
	FinestraNom() {
		finestra.setSize(500, 100);
		finestra.setLocationRelativeTo(null);
		finestra.setLayout(new BorderLayout());
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		finestra.setTitle("Nombre");
		
		txt.setSize(new Dimension(400, 100));
		txt.setFont(new Font("Arial", 0, 12));
		
		botoAcceptar.setText("Acceptar");
		botoAcceptar.setSize(new Dimension(300, 100));
		botoAcceptar.addActionListener(new Nom(txt));
		botoAcceptar.setIcon(new ImageIcon("src/Recursos/Aceptar.gif"));
		
		finestra.add("North", txt);
		finestra.add("South", botoAcceptar);
		finestra.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FinestraNom();
	}
}
