package Tema5;

public class Moneda extends Sorteo {
	
	public int lanzar() {
		posibilidades = (int)Math.random() * 2 + 1;
		if(posibilidades == 1) { System.out.println("cara"); }
		else { System.out.println("cruz"); }
		return posibilidades;
	}
}
