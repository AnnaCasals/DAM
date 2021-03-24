package tema3;

import java.util.*;
public class Consumo {
	private static double kms, litros, vmed, pgas;
	
	Consumo() {
		kms = litros = vmed = pgas = 0;
	}
	
	Consumo(double k, double l, double v, double p) {
		kms = k; 
		litros = l;
		vmed = v;
		pgas = p;
	}
	
	double getTiempo() {
		return kms / vmed;
	}
	
	double consumoMedio() {
		return litros * 100 / kms;
	}
	
	double consumoEuros() {
		return pgas * litros * 100 / kms;
	}
	
	void setKms(double k) {
		kms = k;
	}
	
	void setLitros(double l) {
		litros = l;
	}
	
	void setVMed(double v) {
		vmed = v;
	}
	
	void setPGas(double p) {
		pgas = p;
	}
	
	public static void main(String[] args) {
		Consumo a = new Consumo();
		Scanner sc = new Scanner(System.in);
		System.out.print("Cuantos kms: ");
		double k = sc.nextDouble();
		System.out.print("Cuantos litros: ");
		double l = sc.nextDouble();
		System.out.print("Precio gasolina: ");
		double p = sc.nextDouble();
		System.out.print("Velocidad media: ");
		double v = sc.nextDouble();
		a.setKms(k); a.setLitros(5); a.setPGas(p); a.setVMed(v);
		System.out.println("kms: " + kms + ", litros: " + litros + ", vmed: " + vmed + ", pgas: " + pgas );
		System.out.println("El tiempo es " + a.getTiempo());
		System.out.println("El consumo medio es " + a.consumoMedio());
		System.out.println("El gasto es " + a.consumoEuros());
		
		System.out.println();
		Consumo b = new Consumo(15, 6, 1.3, 100);
		System.out.println("kms: " + kms + ", litros: " + litros + ", vmed: " + vmed + ", pgas: " + pgas );
		System.out.println("El tiempo es " + b.getTiempo());
		System.out.println("El consumo medio es " + b.consumoMedio());
		System.out.println("El gasto es " + b.consumoEuros());
	}
}
