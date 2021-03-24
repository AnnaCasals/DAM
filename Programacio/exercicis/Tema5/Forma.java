package Tema5;

public abstract class Forma {
	
	public abstract String toString();
	public void identidad() {
		System.out.println(this.getClass().getName().substring(6));
	}
	
	public static void main(String[] args) {
		/* Exercici 7
		 * Circulo ci = new Circulo(); 	
		 * Triangulo t = new Triangulo();
		 * Rombo r = new Rombo();
		 * Cuadrado cu = new Cuadrado();
		 * System.out.println(ci.toString());
		 * ci.identidad();
		 * System.out.println(t.toString());
		 * t.identidad();
		 * System.out.println(r.toString());
		 * r.identidad();
		 * System.out.println(cu.toString());
		 * cu.identidad(); 
		 */
		
		Forma f = new Circulo();
		f.identidad();
		Circulo c = new Circulo();
		((Forma) c).identidad();
		((Circulo) f).identidad();
//		Forma f2 = new Forma();  No es pot crear
//		f2.identidad();
		((Forma) f).identidad();
	}
}

class Circulo extends Forma {
	public String toString() {
		return "Cercle";
	}
}

class Cuadrado extends Forma {
	public String toString() {
		return "Quadrat";
	}
}

class Triangulo extends Forma {
	public String toString() {
		return "Triangle";
	}
}

class Rombo extends Forma {
	public String toString() {
		return "Rombe";
	}
}