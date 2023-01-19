/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diferencanumeros;

import java.util.Scanner;
public class DiferencaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       Scanner entrada = new Scanner (System.in);
       
       System.out.println("Digite um valor: ");
       int a = entrada.nextInt();
       System.out.println("Digite um valor: ");
       int b = entrada.nextInt();
       System.out.println("Digite um valor: ");
       int c = entrada.nextInt();
       System.out.println("Digite um valor: ");
       int d = entrada.nextInt();
       double diferenca = (a * b) - (c * d); 
       
       System.out.println("Diferença entre os números: " + diferenca);
    }
    
}
