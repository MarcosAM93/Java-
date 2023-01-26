/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication48;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
      
       Random numeros = new Random(100);
       System.out.println("Digite um número: ");
       int num = entrada.nextInt();
       
       while (num > 0) {
           if (num == numeros) {
               System.out.println("Acertou !!");
           }  else if (num > numeros) {
               System.out.println("Número maior que o ramdomico");
           }  else if (num < numeros) {
               System.out.println("Número menor que o ramdomico");
               } 
       } 
      
    }
    
}
