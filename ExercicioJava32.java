/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava32;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
       
        System.out.println("Digite um número maior que 0: ");
        int numero = entrada.nextInt();
        
        int valor = 1;
        int divisor = 0;
        
        if (numero > 0) {
            while (valor <= numero) {
                if (numero % valor == 0) {
                    divisor ++;
                }
                valor ++;
            } if (divisor == 2) {
            System.out.println (numero + " é um número primo");
        } else if (divisor != 2) {
             System.out.println (numero + " não é um número primo");
        } else {
             System.out.println ("Número digitado é 0 ou negativo");
        }
       } 
        
        
         
        
       
       
     
    }
    
}
