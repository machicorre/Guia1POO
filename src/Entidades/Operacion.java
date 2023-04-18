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
public class Operacion {
    private double numero1, numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    public void crearOperacion(){
    Scanner leer= new Scanner (System.in);
        System.out.println("ingrese primer y segundo numero");
        numero1= leer.nextDouble();
        numero2= leer.nextDouble();
        this.numero1= numero1;
        this.numero2=numero2;
        
        //esto se puede unificar y poner directamente con el this.numero1=leer
    }
      
    public double sumar(){
        double result;
        result= numero1+numero2;
        return result;
        //ejemplo realizado utilizando variable en restar se hzo sin variable
    }
    
     public double restar(){
        return numero1-numero2;
    }
     
       public double multiplicar(){
         double product;
           if (numero1==0 || numero2==0) {
               System.out.println("error"); 
               product=0;
           }else {
           
        product= numero1*numero2;
           }
        return product;
    }

     public double dividir(){
         double divis;
           if (numero2==0) {
               System.out.println("error"); 
               divis=0;
           }else {
           
        divis= numero1/numero2;
           }
        return divis;
    }
       
           
       
    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    
}
        
        


