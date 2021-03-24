package tema3;

public class Satelite {
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	
	Satelite(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}
	
	Satelite() {
		meridiano = paralelo = distancia_tierra = 0;
	}
	
	public void setPosicion(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}
	public void printPosicion() {
		System.out.println ("El satellite se encuentra en el paralelo " + paralelo + " meridiano " + meridiano + 
				" a una distancia de la tierra de " + distancia_tierra + " kilómetros" );
	}
	
	public static void main(String[] args) {
		Satelite a = new Satelite();
		Satelite b = new Satelite(44.5, 5.2, 6.8);
		a.printPosicion();
		b.printPosicion();
		a.setPosicion(0.2, 0.3, 0.4);
		a.printPosicion();
	}

}
