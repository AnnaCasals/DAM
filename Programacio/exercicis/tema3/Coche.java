package tema3;
import java.util.*;

public class Coche {
	private int velocidad;
	
	public void coche() { velocidad = 0; }
	
	public int getVelocidad() { return velocidad; }
	
	public void acelera(int mas) { velocidad = velocidad + mas;	}
	
	public void frena(int menos) { velocidad = velocidad - menos; }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Coche a = new Coche();
		System.out.println("La velocitat actual és: " + a.getVelocidad());
		String c = "a";
		while(c != "e") {
			System.out.print("Vols accelerar o frenar o eixir? (a/f/e): ");
			c  = sc.next();
			switch(c) {
				case "a": 
					System.out.print("Quants km vols accelerar: ");
					int ac = sc.nextInt();
					a.acelera(ac);
					System.out.println("La velocitat actual és: " + a.getVelocidad());
					System.out.println();
					c = "a"; break;
				case "f":
					System.out.print("Quants km vols frenar: ");
					a.frena(sc.nextInt());
					System.out.println("La velocitat actual és: " + a.getVelocidad());
					System.out.println();
					c = "f"; break;
				case "e": 
					c = "e"; break;
				default: 
					c ="e"; break;
			}
		}
		if( c == "e") {
			System.out.println("La velocitat final és: " + a.getVelocidad());
		}
		sc.close();
	}
	
}
