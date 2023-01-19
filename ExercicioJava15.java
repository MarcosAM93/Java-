/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lernumeroternario;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class LerNumeroTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();
        String mensagem = numero > 10
        ? "Número maior que 10"
        : numero < 5 && numero > 5
        ? "Número menor que 10"
        :"Número maior que 5";
        
        System.out.println(mensagem);
            
             
                
        
       
    }
    
}
