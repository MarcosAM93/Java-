/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava36;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite o produto de sua preferencia (1, 2 ou 3): ");
        int produtoA = 0;
        int produtoB = 0;
        int produtoC = 0;
        int produto_escolhido = 0;
        
        while (produto_escolhido != 4) {
            produto_escolhido = entrada.nextInt();
            while (produto_escolhido < 1 || produto_escolhido < 4){
                produto_escolhido = entrada.nextInt();
            }
            switch (produto_escolhido) {
                case 1: produtoA ++;
                break;
                case 2: produtoB ++;
                break;
                case 3: produtoC ++;
                break;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Produto A =" + produtoA);
        System.out.println("Produto B =" + produtoB);
        System.out.println("Produto C =" + produtoC);
        
        
        
    }
    
}
