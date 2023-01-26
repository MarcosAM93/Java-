/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio1trilha8;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
       double aumento, valor, imposto;
        
       System.out.println("Digite o preço do produto: ");
       double preco = entrada.nextDouble();
       System.out.println("Categoria: digite 1 para limpeza, 2 para limentacao e 3 para vestuário) ");
       int categoria = entrada.nextInt();
       System.out.println("Digite se o produto precisa de refrigeracao (R = precisa ou N = nao precisa): ");
       char situacao = entrada.nextString(); 
       
        if (preco <= 25) {
           if (categoria == 1) {
               aumento = 0.05;
           } else if ( categoria == 2) {
               aumento = 0.08;
           } else if ( categoria == 3) {
               aumento = 0.10;
           } else {
               System.out.println("Categoria nao encontrada");
           }
          }  
        
        if (preco > 25) {
           if (categoria == 1) {
               aumento = 0.12;
           } else if ( categoria == 2) {
               aumento = 0.15;
           } else if ( categoria == 3) {
               aumento = 0.18;
           } else {
               System.out.println("Categoria nao encontrada");
           }
          }  
        
        valor = preco + aumento;
        System.out.println("Valor do aumento " + aumento + "Novo valor: " + valor);
        
        if (categoria == 2 || situacao == R) {
            imposto = valor * 0.05;
          }  
        else {
            imposto = valor * 0.08;    
                }
        
         if (valor <= 50) {
               System.out.println("Barato");
           } else if ( valor > 50 && valor <120) {
              System.out.println("Normal");
           } else {
               System.out.println("Caro");
           }
                
        
        
    }
    
}
