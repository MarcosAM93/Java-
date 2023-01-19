/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package valorareacirculo;

import java.util.Scanner;

        public class ValorAreaCirculo {

   
    public static void main(String[] args) {
        
        System.out.println("Digite o valor do raio: ");
        Scanner entrada = new Scanner (System.in);
        
        double raio = entrada.nextDouble();
        double area = Math.PI * (raio * raio);
       
        System.out.println("O valor da área é: " + area);
       
    }
    
}
