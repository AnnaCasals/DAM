package envioObjetos;

import java.io.*;

public class Numeros implements Serializable {
	int numero;
	long cuadrado;
	long cubo;
	
	Numeros() {
		super();
		numero = 0;
		cuadrado = 0;
		cubo = 0;
	}
	
	Numeros(int n, long cuad, long cub) {
		super();
		numero = n;
		cuadrado = cuad;
		cubo = cub;
	}
	
	public int getNumero() { return numero; }
	public long getCuadrado() { return cuadrado; }
	public long getCubo() { return cubo; }
	
	public void setNumero(int n) { numero = n; }
	public void setCuadrado(long c) { cuadrado = c; }
	public void setCubo(long c) { cubo = c; }
	
}
