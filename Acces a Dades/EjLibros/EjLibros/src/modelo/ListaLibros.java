package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaLibros implements Serializable {
    private ArrayList<Libro> listaLibros;

    public ListaLibros() {
        listaLibros = new ArrayList<>();
    }
    
    public Libro getLibro(int p){
        return listaLibros.get(p);
    }
    
    public void setLibro(Libro lb){
        listaLibros.add(lb);
    } 
    
    public int longitud(){
        return listaLibros.size();
    }
    
    public void eliminar(int p){
        listaLibros.remove(p);
    }
    
    public void actualizar(Libro lb, int p){
    //actualizo en la posicion que recibo con el objeto que recibo
        listaLibros.get(p).setTitulo(lb.getTitulo());
        listaLibros.get(p).setAutor(lb.getAutor());
        listaLibros.get(p).setGenero(lb.getGenero());
        listaLibros.get(p).setAnyo(lb.getAnyo());
    
    }
}

