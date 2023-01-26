/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava51;

/**
 *
 * @author marcos.amaral
 */
public class triangulo {
     private double lado1;
     private double lado2;
     private double base;
     private double S;  
     private double radicando;  
     private double area;  
     
     void status (){
         System.out.println("Lado 1 do triangulo: " + this.lado1);
         System.out.println("Lado 2 do triangulo: " + this.lado2);
         System.out.println("base do triangulo: " + this.base);
         System.out.println("semi perímetro do triangulo: " + this.S);
         System.out.println("Área do triangulo: " + this.area);
         System.out.println("Radicando do triangulo: " + this.radicando);
         }

     
     
    
    public static void main(String[] args) {
        triangulo x = new triangulo ();
        x.lado1 = 4.5;
        x.lado2 = 4.5;
        x.base = 5.5;
        x.S = (x.lado1 + x.lado2 + x.base) / 2;
        x.radicando = x.S * (x.S - x.lado1) * (x.S - x.lado2) * (x.S - x.base);
        x.area = Math.pow(x.radicando, 2);
        System.out.println(" ");
        
        triangulo y = new triangulo ();
        y.lado1 = 3.5;
        y.lado2 = 4.5;
        y.base = 5.5;
        y.S = (y.lado1 + y.lado2 + y.base) / 2;
        y.radicando = y.S * (y.S - y.lado1) * (y.S - y.lado2) * (y.S - y.base);
        y.area = Math.pow(y.radicando, 2);
        System.out.println(" ");
        
        if (x.area > y.area) {
            System.out.println("Triangulo x tem a area maior.");
        } else {
            System.out.println("Triangulo y tem a area maior");
        }
        
       
        
        
    }
    
}
