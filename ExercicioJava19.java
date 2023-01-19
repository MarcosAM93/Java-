/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava19;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
        
         System.out.println("Digite um número: ");
         int numero = entrada.nextInt();
         
         if (numero > 0) {
             if (numero % 2 == 0){
                 System.out.println("Número par");
             } else if (numero % 2 != 0){
                 System.out.println("Número ímpar");
             }
         } else {
             System.out.println("Número negativo");
         }
    }
    
}
