/*
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años
 */
package Principal;

import Entidades.Empleado;

/**
 *
 * @author marisa
 */
public class Ejercicio5ExtraPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Empleado emple = new Empleado ();
      
      emple.calcularAumento();
    }
    
}
