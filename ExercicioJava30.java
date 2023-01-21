/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava30;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       System.out.println("Digite um ssalário: ");
       float salario = entrada.nextFloat();
       
      if (salario < 1993.98) {
           System.out.println("Isento");
          }  else if (salario >= 1993.99 && salario <= 2826.65) {
           System.out.println("imposto de 7.5% = " + 0.075 * salario);
          }  else if (salario >= 2826.66 && salario >= 3751.05) {
           System.out.println("imposto de 15% = " + 0.15 * salario);
          }  else if (salario >= 3751.06 && salario <= 4664.68) {
           System.out.println("imposto de 22.5% = " + 0.225 * salario);
          }  else {
           System.out.println("imposto de 27.5% = " + 0.275 * salario);
          }  
          
    }  
    
}
