/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava23;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
         
       System.out.println("Escolha uma das opcöes: ");
       String opcoes = entrada.next();
       float outro_valor = entrada.nextFloat();
       
        switch (opcoes) {
            case "1":
            System.out.println("Vocë doou R$ 10");
            System.out.println("Obrigado pela doação");
            break;
            case "2":
            System.out.println("Vocë doou R$ 25");
            System.out.println("Obrigado pela doação");
            break;
            case "3":
            System.out.println("Vocë doou R$ 50");
            System.out.println("Obrigado pela doação");
            break;
            case "4":
            System.out.println("Digite o valor que deseja doar: ");
            System.out.println("Vocë doou R$ 10");
            System.out.println("Obrigado pela doação");
            break;
            case "5":
            System.out.println("Operação cancelada");
            break;
           
        }
    }
    
}
