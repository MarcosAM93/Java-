/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somar;
import java.util.Scanner;


public class Somar {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int a;
        int b;
        int soma;
        
        System.out.println ("Digite um número: ");
        a = entrada.nextint ();
        System.out.println ("Digite outro número: ");
        b = entrada.nextint ();
        
        soma = a + b;
                
       System.out.println("Resultado: " + soma);
        
    }
    
}
