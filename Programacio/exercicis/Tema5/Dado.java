package Tema5;

public class Dado extends Sorteo {
	public int lanzar() {
		posibilidades = (int)(Math.random() * 6 + 1);
		return posibilidades;
	}
}
