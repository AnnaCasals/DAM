package tema3;
import java.util.*;
public class Restaurante {
	private double chocos, papas;
	
	Restaurante(double c, double p) {
		chocos = c; 
		papas = p;
	}
	
	public void addChocos(int c) {
		chocos += c;
	}
	
	public void addPapas(int p) {
		papas += p;
	}
	
	public int getComensales() {
		return (int)((papas * (chocos * 2)) * 3);
		/*int comensales;
		int n1, n2;
		n1 = (int) (papas * 3); 
		n2 = (int) (chocos * 2 * 3);
		if(n1 >= n2) {
			comensales = n2;
		} else {
			comensales = n1;
		}
		return comensales; */
	}
	
	public void showChocos() {
		System.out.println("Quedan " + chocos + " kg de chocos");
	}
	
	public void showPapas() {
		System.out.println("Quedan " + papas + " kg de papas");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cuantos kilos de chocos tenemos en el almacén? ");
		double c = sc.nextDouble();
		System.out.print("Cuantos kilos de papas tenemos en el almacén? ");
		double p = sc.nextDouble();
		Restaurante a = new Restaurante(c, p);
		System.out.println("EL número de comensales que puede comer es " + a.getComensales());
		a.showChocos(); a.showPapas();
	}
}
