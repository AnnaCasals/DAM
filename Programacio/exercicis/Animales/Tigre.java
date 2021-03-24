package Animales;

public class Tigre extends Felinos {
	private int patas;
	private boolean salvaje;
	
	Tigre() { 
		setEspecie("tigre");
		setColor("blanco");
		patas = 4;
		salvaje = true;
	}
	
	public int getPatas() { return patas; }
	public boolean getSalvaje() { return salvaje; }
	
	public void setPatas(int p) { patas = p; }
	public void setSalvaje(boolean s) { salvaje = s; }
	
	public void caminar() { System.out.print("camina, "); }
	public void nadar() { System.out.print("nada, "); }
}
