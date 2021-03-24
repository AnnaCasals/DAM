package interficie;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Calcular implements ActionListener {
	JTextField objSolut;
	JTextField objDisolucio;
	JTextField objResultat;
	double solut, disolucio;
	
	Calcular(JTextField txtSolut, JTextField txtDisolucio, JTextField txtResultat) {
		objSolut = txtSolut;
		objDisolucio = txtDisolucio;
		objResultat = txtResultat;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		try {
			solut = Double.parseDouble(objSolut.getText().replace(',', '.'));
			disolucio = Double.parseDouble(objDisolucio.getText().replace(',', '.'));
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Introduce valores numéricos");
			return;
		}
		if(solut <= 0) {
			JOptionPane.showMessageDialog(null, "Soluto: escribe un valor positivo");
			return;
		}
		if(disolucio <= 0) {
			JOptionPane.showMessageDialog(null, "Disolución: escribe un valor positivo");
			return;
		}
		DecimalFormat miFormato = new DecimalFormat("#, ##0.00");
		objResultat.setText(miFormato.format((solut/disolucio)));
	}

}
