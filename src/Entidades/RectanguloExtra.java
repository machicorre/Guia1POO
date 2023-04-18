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
public class RectanguloExtra {
    private int lado1;
    private int lado2;

    public RectanguloExtra() {
    }

    public RectanguloExtra(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    public void calcular_area () {
        Scanner leer= new Scanner(System.in);
        
        int area ;
        
        System.out.println("ingrese lado 1");
        lado1= leer.nextInt();
        System.out.println("ingrese lado 2");
        lado2= leer.nextInt();
         area= lado1*lado2;  
         System.out.println("el area es igual a "+ area);
    }
    
}
