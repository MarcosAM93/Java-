/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava16;
import java.util.Scanner;
/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite um número: ");
        int numero_1 = entrada.nextInt();
        System.out.println("Digite outro número: ");
        int numero_2 = entrada.nextInt();
        
        int resultado = numero_1 > numero_2
        ? numero_1 + numero_2
        : numero_2 > numero_1
        ? numero_1 - numero_2
        : numero_1 - numero_2;
        
        System.out.println(resultado);
        
        
                
    }
    
}
