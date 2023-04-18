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
public class Juego {
    private int numero1, numero2;

    public Juego() {
    }

    public Juego(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
  
   public void iniciarJuego(){
       
      
       int gano1=0;
       int gano2=0;
       String continuar="";
       
       do{
       Scanner leer= new Scanner(System.in);
       System.out.println("jugador 1 ingrese numero adivinar");
       numero1= leer.nextInt();
           int contador1=0; 
       do {
           System.out.println("jugador 2 ingrese un numero");  
           numero2=leer.nextInt();
           
           if (numero1==numero2) {
               System.out.println("adivino");
               gano2++;
               break;
               
           }
           else {
               if (numero1>numero2) {
                   System.out.println("mas alto");
                   
               }else {
                   System.out.println("mas bajo");
               }
               contador1++;
               
               System.out.println("quedan "+(5-contador1)+"intentos"); 
           }
           
       } while (contador1<5);
       
           if (contador1==5) {
               System.out.println("gano jugador 1");
               gano1++;
               
           }
  
       System.out.println("quiere seguir jugando");
       continuar=leer.next();
       
       }
       while (continuar.equalsIgnoreCase("s"));
       
       System.out.println("el jugador 1 gano "+ gano1);
       System.out.println("el jugador 2 gano "+ gano2);
       
   } 
    
    
}
