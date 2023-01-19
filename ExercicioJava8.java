/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leitordepecas;

import  java.util.Scanner;
public class LeitorDePecas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);

       System.out.println("Digite o código da peça 1: ");
       float codigo_peca1 = entrada.nextFloat();
       System.out.println("Digite a quantidade de peças 1: ");
       int quantidade1 = entrada.nextInt();
       System.out.println("Digite o valor unitário da peça 1: ");
       float valor_peca1 = entrada.nextFloat();
       
       System.out.println("Digite o código da peça 2: ");
       float codigo_peca2 = entrada.nextFloat();
       System.out.println("Digite a quantidade de peças 2: ");
       int quantidade2 = entrada.nextInt();
       System.out.println("Digite o valor unitário da peça 2: ");
       float valor_peca2 = entrada.nextFloat();
       System.out.println("Digite o valor unitário da peça 2: ");
       
       float total_pagar = (quantidade1 * valor_peca1) + (quantidade2 * valor_peca2);
       
       System.out.println("O valor a pagar é: " + total_pagar);
       
       
       
    }
    
}
