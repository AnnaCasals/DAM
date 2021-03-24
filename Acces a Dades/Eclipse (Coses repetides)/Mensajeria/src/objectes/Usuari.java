package objectes;

public class Usuari {
	String nom;
	String contrasenya;
	boolean tipus;
	
	Usuari(String n, String c) {
		nom = n;
		contrasenya = c;
		tipus = false;
	}
	
	public String getNom() { return nom; }
	public String getContrasenya() { return contrasenya; }
	
	public void setNom(String n) { nom = n; }
	public void setContrasenya(String c) { contrasenya = c; }
}
