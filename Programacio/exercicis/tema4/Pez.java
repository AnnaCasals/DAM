package tema4;

public class Pez implements Cloneable {
	protected String nombre;
	
	public String getNombre() { return this.nombre; }
	public void setNombre(String nom) { this.nombre = nom; }
	
	public Object clone() {
		Object objeto = null;
		try {
			objeto = super.clone();
		} catch(CloneNotSupportedException ex) {
			System.out.println("Error al duplicar");
		}
		return objeto;
	}
	public boolean equals(Pez ese) {
		if(ese.getNombre() == this.getNombre()) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Pez a = new Pez();
		a.setNombre("qwertee");
		System.out.println(a.getNombre());
		Pez b = new Pez();
		b.setNombre("qwerty");
		System.out.println(b.getNombre());
		Pez c = (Pez)a.clone();
		System.out.println(c.getNombre());
		System.out.println("És " + a.getNombre() + " igual a " + c.getNombre()  + "? " + a.equals(c));
		System.out.println("És " + a.getNombre() + " igual a " + b.getNombre() + "? " + a.equals(b));
	}
}
