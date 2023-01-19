/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava22;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
         
       System.out.println("Nome do funcionário: ");
       String funcionario = entrada.next();
       System.out.println("Digite seu salário: ");
       float salario = entrada.nextFloat();
       
        if (salario >= 0 && salario <= 3) {
           System.out.println("% de aumento = 20" + "salário atual = " + salario + "salário novo = " + (0.20 * salario));
          }  else if (salario >= 4 && salario <= 6) {
            System.out.println("% de aumento = 15" + "salário atual = " + salario + "salário novo = " + (0.15 * salario));
          }  else if (salario >= 4 && salario <= 6) {
            System.out.println("% de aumento = 12" + "salário atual = " + salario + "salário novo = " + (0.12 * salario));
          }  else if (salario >= 4 && salario <= 6) {
            System.out.println("% de aumento = 10" + "salário atual = " + salario + "salário novo = " + (0.10 * salario));
          }  else if (salario >= 4 && salario <= 6) {
            System.out.println("% de aumento = 7" + "salário atual = " + salario + "salário novo = " + (0.07 * salario));
          }  else if (salario >= 4 && salario <= 6) {
            System.out.println("% de aumento = 0" + "salário atual = " + salario + "salário novo = " + (0.00 * salario));
          }  
         
       
           }
    
}
