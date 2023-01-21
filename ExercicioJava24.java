/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava24;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
         
       System.out.println("Digite um número: ");
       float num1 = entrada.nextFloat();
       System.out.println("Digite outro número: ");
       float num2 = entrada.nextFloat();
       System.out.println("Digite o tipo de operacao que deseja realizar: ");
       String operacao = entrada.next();
       
       
      switch (operacao) {
            case "soma":
            System.out.println(num1 + num2);
            break;
            case "sub":
            System.out.println(num1 - num2);
            break;
            case "multi":
            System.out.println(num1 * num2);
            break;
            case "div":
            System.out.println(num1 / num2);
            break;
      }
            
    }
    
}
