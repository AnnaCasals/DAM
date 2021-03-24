package tema3;
import java.util.*;
public class Peso {
	private static double pkg;
	
	Peso(double p, String u) {
		switch(u)  {
			case "Lb":
				pkg = p * 0.453;
				break;
			case "Li":
				pkg = p * 14.59;
				break;
			case "Oz":
				pkg = p * 0.02835;
			case "P":
				pkg = p * 0.00155;
				break;
			case "K":
				pkg = p;
				break;
			case "G":
				pkg = p * 0.001;
				break;
			case "Q":
				pkg = p * 43.3;
				break;
		}
	}
	
	double getLibras() {
		return pkg / 0.453;
	}
	double getLingotes() {
		return pkg / 14.59;
	}
	double getPeso(String a) {
		double p = 0;
		switch(a) {
		case "Lb":
			p = pkg / 0.453;
			break;
		case "Li":
			p = pkg / 14.59;
			break;
		case "Oz":
			p = pkg / 0.02835;
		case "P":
			p = pkg / 0.00155;
			break;
		case "K":
			p = pkg;
			break;
		case "G":
			p = pkg / 0.001;
			break;
		case "Q":
			p = pkg / 43.3;
			break;
		}
		return p;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix un pes: ");
		double p = sc.nextDouble();
		System.out.print("En quina medida és el pes?(Lb/Li/Oz/P/K/G/Q) ");
		String m = sc.next();
		Peso a = new Peso(p, m);
		System.out.println("En lliures és: " + a.getLibras());
		System.out.println("En lingots és: " + a.getLingotes());
		System.out.print("En quina medida vols que te torne el pes introduït?(Lb/Li/Oz/P/K/G/Q) ");
		m = sc.next();
		System.out.println("El pes en " + m + " és: " + a.getPeso(m));
	}
}
