/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava35;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite um número: ");
        int x = entrada.nextInt();
         System.out.println("Digite outro número: ");
        int y = entrada.nextInt();
        
        do {
            if (x > 0 && y > 0) {
                System.out.println ("primeiro quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto quadrante");
            } else {
                System.out.println("Algorismo interrompido!!");
            }
         
        } while (x!= 0 && y != 0);
        
    }
    
}
