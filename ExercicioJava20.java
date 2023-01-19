/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava20;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
         
       System.out.println("Digite seu salário: ");
       float salario = entrada.nextFloat();
       System.out.println("Digite o valor desejado para o financiamento: ");
       float financiamento = entrada.nextFloat();
       
       if (financiamento <= (salario * 5)) {
           System.out.println("Financiamento Concedido.");
           System.out.println("Obrigado por nos consultar.");
       }   else {
           System.out.println("Financiamento Negado.");
           System.out.println("Obrigado por nos consultar.");
         
       
         
         
    }
    
}
