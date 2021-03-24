package interficie;

import javax.swing.*;
import java.awt.*;

public class FinestraAssignatura {
	JFrame finestra = new JFrame();
	JTextField txt = new JTextField();
	JButton botoCentre = new JButton();
	JButton botoLocalitat = new JButton();
	JButton botoAssignatura = new JButton();
	JPanel marBoto = new JPanel();
	
	
	FinestraAssignatura() {
		finestra.setSize(500, 200);
		finestra.setLayout(new BorderLayout());
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		finestra.setLocationRelativeTo(null);
		finestra.setTitle("Assignatura");
		
		botoCentre.setText("Centre");
		botoCentre.addActionListener(new Centre(txt));
		botoCentre.setSize(new Dimension(50, 25));
		botoCentre.setIcon(new ImageIcon("src/Recursos/centre.gif"));
		
		botoLocalitat.setText("Localitat");
		botoLocalitat.addActionListener(new Localitat(txt));
		botoLocalitat.setSize(new Dimension(50, 25));
		botoLocalitat.setIcon(new ImageIcon("src/Recursos/localitat.gif"));
		
		botoAssignatura.setText("Assignatura");
		botoAssignatura.setSize(new Dimension(50, 25));
		botoAssignatura.addActionListener(new Assignatura(txt));
		botoAssignatura.setIcon(new ImageIcon("src/Recursos/asignatura.gif"));
		
		txt.setFont(new Font("Arial", 0, 12));
		txt.setSize(new Dimension(400, 100));
		
		marBoto.add(botoCentre);
		marBoto.add(botoLocalitat);
		marBoto.add(botoAssignatura);
		finestra.add("North", txt);
		finestra.add("South", marBoto);
		finestra.setVisible(true);
	}
	public static void main(String[] args) {
		new FinestraAssignatura();
	}

}
