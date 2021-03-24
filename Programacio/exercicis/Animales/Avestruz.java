package Animales;

public class Avestruz extends Aves {
	private boolean salvaje;
	
	Avestruz() { 
		setEspecie("avestruz");
		setColor("blanco");
		salvaje = true;
	}
	
	public boolean getSalvaje() { return salvaje; }
	
	public void setSalvaje(boolean s) { salvaje = s; }
	
	public void caminar() { System.out.print("camina, "); }
	
}
