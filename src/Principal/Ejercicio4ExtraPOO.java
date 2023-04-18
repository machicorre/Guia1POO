/*Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidades.Cuenta;

/**
 *
 * @author marisa
 */
public class Ejercicio4ExtraPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta count = new Cuenta();
     
        count.retirar();
    }
    
}
