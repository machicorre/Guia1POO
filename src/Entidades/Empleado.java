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
public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularAumento() {
        String respuesta;
       
        do {
            
                
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese nombre empleado");
        nombre = leer.next();
        System.out.println("ingrese salario actual");
        salario = leer.nextDouble();
        System.out.println("ingrese edad ");
        edad = leer.nextInt();
        if (edad >= 30) {
            System.out.println("el salario de " + nombre + " es " + salario * 1.10
            );

        } else {
            System.out.println("el salario de " + nombre + " es " + salario * 1.05
            );
        } System.out.println("desea continuar S/N");
         respuesta= leer.next();
        
        } while (respuesta.equalsIgnoreCase("S") );
        
                
    }
}
