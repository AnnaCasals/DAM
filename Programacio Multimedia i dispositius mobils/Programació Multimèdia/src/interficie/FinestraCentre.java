package interficie;

import javax.swing.*;
import java.awt.*;

public class FinestraCentre {
	JFrame finestra = new JFrame();
	JTextField txt = new JTextField();
	JButton botoCentre = new JButton();
	JButton botoLocalitat = new JButton();
	JPanel marBoto = new JPanel();
	
	FinestraCentre() {
		finestra.setSize(400, 200);
		finestra.setLayout(new BorderLayout());
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		finestra.setLocationRelativeTo(null);
		finestra.setTitle("Centre d'estudis");
		
		botoCentre.setText("Centre");
		botoCentre.addActionListener(new Centre(txt));
		botoCentre.setSize(new Dimension(50, 25));
		botoCentre.setIcon(new ImageIcon("src/Recursos/centro.gif"));
		
		botoLocalitat.setText("Localitat");
		botoLocalitat.addActionListener(new Localitat(txt));
		botoLocalitat.setSize(new Dimension(50,25));
		botoLocalitat.setIcon(new ImageIcon("src/Recursos/localidad.gif"));
		
		txt.setFont(new Font("Arial", 0, 12));
		txt.setSize(new Dimension(400, 100));
		
		marBoto.add(botoCentre);
		marBoto.add(botoLocalitat);
		finestra.add("North", txt);
		finestra.add("South", marBoto);
		finestra.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FinestraCentre();
	}
}
