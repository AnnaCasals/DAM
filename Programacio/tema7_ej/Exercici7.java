package tema7_ej;

public class Exercici7 implements java.io.Serializable {
	protected String nombre;
	protected long telefono;
	Exercici7(String n, long t) {
		nombre = n;
		telefono = t;
	}
	public void print() {
		System.out.println(nombre + "->" + telefono);
	}
}
