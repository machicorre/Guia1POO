/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author marisa
 */
public class Cuenta {

    private int saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirar() {
        int monto = 0;
        int saldo;

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese saldo de la cuenta");
        saldo = leer.nextInt();

        do {

            System.out.println("cuanto dinero desea retirar");
            monto = leer.nextInt();
            if (saldo - monto < 0) {
                System.out.println("saldo insuficiente para efectuar el retiro");
                break;

            } else {
                saldo = saldo - monto;
                System.out.println("su saldo es " + saldo);

            }

        } while (saldo > 0);

    }

}
