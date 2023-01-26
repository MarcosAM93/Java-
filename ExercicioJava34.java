/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication34;
import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava34 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        /*Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();
        
        for (int i = numero; i > 0; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }*/
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();
        
        while (numero != 0) {
            if (numero % numero == 0) {
                System.out.println (numero);
            }
            numero++;
        }
            
       
       
    }
    
}
