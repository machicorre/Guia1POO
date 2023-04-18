/*
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
Título, Autor, Número de páginas, y un constructor con todos los atributos 
pasados por parámetro y un constructor vacío. Crear un método para cargar 
un libro pidiendo los datos al usuario y luego informar mediante otro método el 
número de ISBN, el título, el autor del libro y el número de páginas.

 */
package Principal;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author marisa
 */
public class Ejercicio1POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       
       Libro Libro1= new Libro ();
       
        System.out.println("ingrese ISBN");
        Libro1.setISBN(leer.nextInt());
        System.out.println("Ingrese titulo");
        Libro1.setTitulo(leer.next());
        System.out.println("Ingrese Autor");
        Libro1.setAutor(leer.next());
        System.out.println("Ingrese paginas");
        Libro1.setPaginas(leer.nextInt());
        
        System.out.println(Libro1.toString());
       
    }
    
}
