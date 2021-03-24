import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Calcular {
	private static Text text;
	
	private static String t = "";
	private static int primer_valor = 0;
	private static int segon_valor = 0;
	private static String ultima_operacio= "";
	private static int res = 0;
	
	/**
	 * Launch the application.
	 * @param args
	 */
	
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shlCalculadora = new Shell();
		shlCalculadora.setMinimumSize(new Point(130, 40));
		shlCalculadora.setSize(378, 285);
		shlCalculadora.setText("Calculadora");
		
		Button boto1 = new Button(shlCalculadora, SWT.NONE);
		boto1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				t += boto1.getText();
				text.setText(t);
			}
		});
		boto1.setBounds(10, 150, 80, 40);
		boto1.setText("1");
		
		Button boto2 = new Button(shlCalculadora, SWT.NONE);
		boto2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				t += boto2.getText();
				text.setText(t);
			}
		});
		boto2.setBounds(96, 150, 80, 40);
		boto2.setText("2");
		
		Button boto3 = new Button(shlCalculadora, SWT.NONE);
		boto3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				t += boto3.getText();
				text.setText(t);
			}
		});
		boto3.setBounds(182, 150, 80, 40);
		boto3.setText("3");
		
		Button boto4 = new Button(shlCalculadora, SWT.NONE);
		boto4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				t += boto4.getText();
				text.setText(t);
			}
		});
		boto4.setBounds(10, 104, 80, 40);
		boto4.setText("4");
		
		Button boto5 = new Button(shlCalculadora, SWT.NONE);
		boto5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				t += boto5.getText();
				text.setText(t);
			}
		});
		boto5.setBounds(96, 104, 80, 40);
		boto5.setText("5");
		
		Button boto6 = new Button(shlCalculadora, SWT.NONE);
		boto6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				t += boto6.getText();
				text.setText(t);
			}
		});
		boto6.setBounds(182, 104, 80, 40);
		boto6.setText("6");
		
		Button boto7 = new Button(shlCalculadora, SWT.NONE);
		boto7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				t += boto7.getText();
				text.setText(t);
			}
		});
		boto7.setBounds(10, 58, 80, 40);
		boto7.setText("7");
		
		Button boto8 = new Button(shlCalculadora, SWT.NONE);
		boto8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				t += boto8.getText();
				text.setText(t);
			}
		});
		boto8.setBounds(96, 58, 80, 40);
		boto8.setText("8");
		
		Button boto9 = new Button(shlCalculadora, SWT.NONE);
		boto9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				t += boto9.getText();
				text.setText(t);
			}
		});
		boto9.setBounds(182, 58, 80, 40);
		boto9.setText("9");
		
		Button boto0 = new Button(shlCalculadora, SWT.NONE);
		boto0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				t += boto0.getText();
				text.setText(t);
			}
		});
		boto0.setBounds(10, 196, 80, 40);
		boto0.setText("0");
		
		Button botoIgual = new Button(shlCalculadora, SWT.NONE);
		botoIgual.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				segon_valor = numIntroduit(t);
				t = "";
				res = executarOperacio();
				t = String.valueOf(res);
				text.setText(t);
				t = "";
			}
		});
		botoIgual.setBounds(182, 196, 80, 40);
		botoIgual.setText("=");
		
		Button botoDivisio = new Button(shlCalculadora, SWT.NONE);
		botoDivisio.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(res == 0) {
					primer_valor = numIntroduit(t);
				} else { primer_valor = res; }
				t = "";
				ultima_operacio = "/";
			}
		});
		botoDivisio.setBounds(268, 58, 80, 40);
		botoDivisio.setText("/");
		
		Button botoMutliplicacio = new Button(shlCalculadora, SWT.NONE);
		botoMutliplicacio.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(res == 0) {
					primer_valor = numIntroduit(t);
				} else { primer_valor = res; }
				t = "";
				ultima_operacio = "*";		
			}
		});
		botoMutliplicacio.setBounds(268, 104, 80, 40);
		botoMutliplicacio.setText("*");
		
		Button botoResta = new Button(shlCalculadora, SWT.NONE);
		botoResta.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(res == 0) {
					primer_valor = numIntroduit(t);
				} else { primer_valor = res; }
				t = "";
				ultima_operacio = "-";		
			}
		});
		botoResta.setBounds(268, 150, 80, 40);
		botoResta.setText("-");
		
		Button botoSuma = new Button(shlCalculadora, SWT.NONE);
		botoSuma.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(res == 0) {
					primer_valor = numIntroduit(t);
				} else { primer_valor = res; }
				t = "";
				ultima_operacio = "+";			
			}
		});
		botoSuma.setBounds(268, 196, 80, 40);
		botoSuma.setText("+");
		
		text = new Text(shlCalculadora, SWT.BORDER);
		text.setBounds(10, 20, 338, 21);

		shlCalculadora.open();
		shlCalculadora.layout();
		while (!shlCalculadora.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
	}
	static int numIntroduit(String a) {
		int numint = Integer.parseInt(a);
		return numint;
	}
	static int executarOperacio() {
		int resultado = 0;
		//int numeroVisualitza = getResultatInt();
		//Operación: división
		if(ultima_operacio.equals("/")) {
			resultado = primer_valor / segon_valor;
		}
		//Operación: multiplicación
		if(ultima_operacio.equals("*")) {
			resultado = primer_valor * segon_valor;
		}
		//Operación: resto
		if(ultima_operacio.equals("-")) {
			resultado = primer_valor - segon_valor;
		}
		//Operación: suma
		if(ultima_operacio.equals("+")) {
			resultado = primer_valor + segon_valor;
		}
		return resultado;
	}

}
