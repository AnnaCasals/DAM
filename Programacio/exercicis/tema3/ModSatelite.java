package tema3;

public class ModSatelite {
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	private boolean terra;
	
	ModSatelite(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}
	
	ModSatelite() {
		meridiano = paralelo = distancia_tierra = 0;
	}
	
	public void setPosicion(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}
	
	public void printPosicion() {
		System.out.println("El satèlit es troba en el paral·lel " + String.format("%.2f", paralelo) + " meridiano " + String.format("%.2f", meridiano)
				+ " a una distància de la terra de " + String.format("%.2f", distancia_tierra) + " kilometros");
	}
	
	void variaAltura(double desplazamiento) {
		distancia_tierra += desplazamiento;
	}
	
	boolean enOrbita() {
		terra = true;
		if(distancia_tierra == 0) {
			terra = false;
		}
		return terra;
	}
	
	void variaPosicion(double variap, double variam) {
		paralelo += variap;
		meridiano += variam;
	}
	
	public static void main(String[] args) {
		ModSatelite a = new ModSatelite();
		ModSatelite b = new ModSatelite(44.5, 5.2, 6.8);
		a.printPosicion(); b.printPosicion();
		a.setPosicion(0.2, 0.3, 0.4);
		a.printPosicion();
		a.variaAltura(0.4); b.variaAltura(-2);
		a.printPosicion(); b.printPosicion();
		if(a.enOrbita()) {
			System.out.println("El satèlit a està en òrbita");
		} else { System.out.println("El satèlit a NO està en òrbita");}
		if(b.enOrbita()) {
			System.out.println("El satèlit b està en òrbita");
		} else { System.out.println("El satèlit b NO està en òrbita");}
		a.variaPosicion(0.33, 0.9); b.variaPosicion(-2, -3);
		a.printPosicion(); b.printPosicion();
	}

}
