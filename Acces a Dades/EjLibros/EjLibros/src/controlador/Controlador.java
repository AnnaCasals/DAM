package controlador;

import java.util.ArrayList;
import modelo.BaseDeDades;
import modelo.ListaLibros;
import modelo.Libro;

public class Controlador {
        private int posicion;
        private ListaLibros ll = new ListaLibros();
        ArrayList<Object[]> llista = BaseDeDades.veureTots();
        
        public Controlador() {
            posicion = 0;
            pasarLlistes();
        }
        
        public void pasarLlistes() {
            String t; String a; String g; int any;
            for(int i = 0; i < llista.size(); i++) {
                t = (String) llista.get(i)[0];
                a = (String) llista.get(i)[1];
                g = (String) llista.get(i)[2];
                any = (int) llista.get(i)[3];
                Libro z = new Libro(t, a, g, any);
                ll.setLibro(z);
            }
            
        }
        
        public Libro primero(){
            posicion = 0;
            return ll.getLibro(posicion);
        }
        
        public Libro ultimo(){
            posicion = ll.longitud() - 1;
            return ll.getLibro(posicion);
        }
        
        public Libro anterior(){
            if (posicion > 0){
                posicion--;
            }
            return ll.getLibro(posicion);
        }
        
        public Libro siguiente(){
            posicion ++;
            if (posicion == ll.longitud()){
                posicion--;
            }
            return ll.getLibro(posicion);
        }
        
        public void nuevo(Libro lb){
            ll.setLibro(lb);
            posicion = ll.longitud() - 1;
            BaseDeDades.InsertarDades(lb.getTitulo(), lb.getGenero(), lb.getAutor(), lb.getAnyo());
        }
        
        public void eliminar(){
            //elimino la posición actual y guardo cambios en fichero
            Libro lb = ll.getLibro(posicion);
            int id = BaseDeDades.idLLibre(lb.getTitulo(), lb.getAutor(), lb.getGenero(), lb.getAnyo());
            //int i = (int) id;
            //guardo en fichero:
            BaseDeDades.borrar(id);
            ll.eliminar(posicion);
        }    
        public void actualizar(Libro z, Libro lb) {
            //actualizo el ListaLibros y guardo en fichero
            int id = BaseDeDades.idLLibre(z.getTitulo(), z.getAutor(), z.getGenero(), z.getAnyo());
            String t = lb.getTitulo();
            String a = lb.getAutor();
            String g = lb.getGenero();
            int any = lb.getAnyo();
            System.out.println(z.getTitulo() + " " + z.getAutor() + " " + z.getGenero() + " " + z.getAnyo());
            System.out.println(t + " " + a + " " + g + " " + any + " " + id);
            
            BaseDeDades.actualitzar(t, a, g, any, id);
            
            ll.actualizar(lb, posicion);
        }
}

