package tema4;


public class Pez2 implements Cloneable {
	protected String nombre;
	private static int numpeces = 0;
	
	Pez2() { numpeces++; } //Exercici6
	Pez2(Pez2 a) {
		this.nombre = a.getNombre();
		numpeces++;
	} //Exercici7
	
	public static int getPeces() { return numpeces; }//Exercici6
	
	public String getNombre() { return this.nombre; }
	public void setNombre(String nom) { this.nombre = nom; }
	
	public Object clone() {
		Object objeto = null;
		try {
			objeto = super.clone();
			numpeces++; //Exercici6
		} catch(CloneNotSupportedException ex) {
			System.out.println("Error al duplicar");
		}
		return objeto;
	}
	public boolean equals(Pez2 ese) {
		if(ese.getNombre() == this.getNombre()) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Pez2 a = new Pez2();
		a.setNombre("qwertee");
		System.out.println(a.getNombre());
		
		Pez2 b = new Pez2();
		b.setNombre("qwerty");
		System.out.println(b.getNombre());
		
		Pez2 c = new Pez2(a);
		System.out.println(c.getNombre());
		
		System.out.println("És " + a.getNombre() + " igual a " + c.getNombre()  + "? " + a.equals(c));
		System.out.println("És " + a.getNombre() + " igual a " + b.getNombre() + "? " + a.equals(b)); 
		System.out.println("El número de peixos creats és: " + getPeces() /* numpeces */);
	}
}
