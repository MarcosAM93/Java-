/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava18;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
         System.out.println("Digite um número: ");
         float numero = entrada.nextInt();
         
         if (numero % 2 == 0) {
             System.out.println("Número Par");
         } else {
             System.out.println("Número ímpar");
         }
         
         }
        
    }
    
}
