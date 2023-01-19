/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava21;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
         
       System.out.println("Digite a nota 1: ");
       float nota_1 = entrada.nextFloat();
       System.out.println("Digite a nota 2: ");
       float nota_2 = entrada.nextFloat();
       System.out.println("Digite a nota 3: ");
       float nota_3 = entrada.nextFloat();
       
       float media = (nota_1 + nota_2 + nota_3) / 3;
       
       
       if (media >= 7 && media <= 10) {
           System.out.println("Aprovado");
          }  else if (media < 7 && media >= 5) {
           System.out.println("Recuperação");
          }  else if (media < 5) {
           System.out.println("Reprovado");
          } 
          
    }
}
