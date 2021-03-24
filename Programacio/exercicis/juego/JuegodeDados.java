package juego;

import juego.Dado;

public class JuegodeDados extends Dado {
	static Dado a, b, c;
	static boolean guanyat;
	static int z, x, y;
	
	static void tresDados() {
		a = new Dado();
		b = new Dado();
		c = new Dado();
	}
	
	static void tiradaDados() {
		a.tirada(); b.tirada();c.tirada();
		z = a.valor();
		y = b.valor();
		x = c.valor();
		if(z == y && y == x) {guanyat = true; 
		} else { guanyat = false; }
	}
	
	public static void main(String[] args) {
		tresDados();
		tiradaDados();
		if(guanyat) {
			System.out.println("Molt bé! Has guanyat (" + z + ", " + y +", "+ x + ")."  );
		} else { System.out.println("Ohh! Has perdut ("+ z + ", " + y +", "+ x + ")." ); }	
	}
	
}
