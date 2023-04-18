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
public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
  public void crearRect () {
      System.out.println("ingrese base y altura");
      Scanner leer= new Scanner (System.in);
      this.altura= leer.nextInt();
      this.base= leer.nextInt();
      
      
  } 
  
  public void superficie() {
      System.out.println("la superficie es " + ( base * altura));
  }
  
   public void perimetro() {
      System.out.println("el perimetro es " + ( (base + altura) * 2));
  }
   
   public void dibujo (){
       for (int i = 0; i < altura; i++) {
           for (int j = 0; j < base; j++) {
               if (i==0 || i==altura-1 || j==0 || j==base-1 ) {
                   System.out.print(" * ");
               } else{
                   System.out.print("   ");   
           }
           
       }System.out.println(" ");
   }
   

   }
}
