/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava27;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
      
        int hora_inicial = entrada.nextInt();
        int hora_final = entrada.nextInt();
        
        int duracao;
       
       if (hora_inicial < hora_final){
           duracao = hora_final - hora_inicial;
       } else {
           duracao = (24 * 60 - hora_inicial) + hora_final;
       }
    }
    
}
