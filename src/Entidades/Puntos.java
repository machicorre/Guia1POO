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
public class Puntos {
    private double x1,y1,x2,y2;

    public Puntos() {
    }

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el valor del pto x1");
        this.x1= leer.nextDouble();
        System.out.println("ingrese el valor del pto y1");
        this.y1= leer.nextDouble();
        System.out.println("ingrese el valor del pto x2");
        this.x2= leer.nextDouble();
        System.out.println("ingrese el valor del pto y2");
        this.y2=leer.nextDouble();
        
    }
     public void calcDistancia() {
         double distancia;
         
         distancia = Math.sqrt( Math.pow(getX2()- getX1(),2) + Math.pow(getY2()
                 - getY1(),2));
         System.out.println("la distancia entre los puntos es " + distancia);
         
     }
    
    
}
