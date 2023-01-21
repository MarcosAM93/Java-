/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava28;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
         
       System.out.println("Digite um número: ");
       int numero = entrada.nextInt();
       
       if (numero >= 0 && numero < 25) {
           System.out.println("Número entre 0 e 25");
          }  else if (numero >= 25 && numero < 50) {
           System.out.println("Número entre 25 e 50");
          }  else if (numero >= 50 && numero < 75) {
           System.out.println("Número entre 50 e 75");
          }  else if (numero >= 75 && numero < 100) {
           System.out.println("número entre 75 e 100");
          }  else {
           System.out.println("Número fora do intervalo");
          }  
    }
    
}
