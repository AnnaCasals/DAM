package Animales;

public class Aves implements PuedeCaminar {
	protected String color;
	protected String especie;
	
	public String getColor() { return color; }
	public String getEspecie() { return especie; }
	
	public void setColor(String c) { color = c; }
	public void setEspecie(String e) { especie = e; }
	
	public void caminar() {
		//System.out.print("CAMINA, ");
	}
}
