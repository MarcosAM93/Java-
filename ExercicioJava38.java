/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava38;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double salario = 1000;
       double aumento = 0.015;
       int ano_inicio = 2010;
       int ano_final= 2022;
       int i;
       
       for (i = ano_inicio + 1; i < ano_final; i++){
           salario = salario + (salario * aumento);
           System.out.println("Salário em %: % - aumento de % " + i + salario + aumento);
       }
       System.out.println("Salário final: " + salario);
    }
    
}
