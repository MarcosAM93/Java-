/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava26;
import java.util.Scanner;
/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       System.out.println ("Digite um número: ");
       int valor_1 = entrada.nextInt();
       System.out.println ("Digite outro número: ");
       int valor_2 = entrada.nextInt();
       
       if (valor_1 % valor_2 == 0) {
           System.out.println("Sao Multiplos");
       } else {
           System.out.println("Nao sao Multiplos");
       } 
       
    }
    
}
