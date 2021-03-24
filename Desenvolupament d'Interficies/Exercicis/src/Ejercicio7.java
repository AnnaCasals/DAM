import java.io.*;
public class Ejercicio7 implements java.io.Serializable {
	protected String nombre;
	protected long telefono;
	Ejercicio7(String n, long t) {
		nombre = n;
		telefono = t;
	}
	public void print() {
		System.out.println(nombre + "->" + telefono);
	}
}
