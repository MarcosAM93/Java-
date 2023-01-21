/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava25;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
         
       System.out.println("Digite seu peso: ");
       float peso = entrada.nextFloat();
       System.out.println("Digite a sua altura: ");
       float altura = entrada.nextFloat();
      
       float IMC = peso / (altura * altura);
       
       
       if (IMC < 16) {
           System.out.println("Magreza grave");
          }  else if (IMC >= 16 && IMC < 17) {
           System.out.println("Magreza moderada");
          }  else if (IMC >= 17 && IMC < 18.5) {
           System.out.println("Magreza leve");
          }  else if (IMC >= 18.5 && IMC < 25) {
           System.out.println("Peso normal");
          }  else if (IMC >= 25 && IMC < 30) {
           System.out.println("Sobrepeso");
          }  else if (IMC >= 30 && IMC < 35) {
           System.out.println("Obesidade grau 1");
          }  else if (IMC >= 35 && IMC < 40) {
           System.out.println("Obesidade grau 2 (severa)");
          }  else if (IMC >= 40) {
           System.out.println("Obesidade grau 3 (morbida)");
          }  
       
        
    }
    
}
