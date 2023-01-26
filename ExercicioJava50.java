/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava50;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite o número total de eleitores: ");
        int eleitores = entrada.nextInt();
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int candidato5 = 0;
        int votantes = 0;
        int mais_votado;
        
        while (votantes < eleitores) {
            System.out.println("Digite o número correspondente ao candidato que deseja votar (1,2,3,4 ou 5: ");
            int voto = entrada.nextInt();
            if (voto == 1) {
                candidato1 = candidato1 + 1;
            } else if (voto == 2) {
                 candidato2 = candidato2 + 1;
            } else if (voto == 3) {
                 candidato3 = candidato3 + 1;
            } else if (voto == 4) {
                 candidato4 = candidato4 + 1;
            } else if (voto == 5) {
                 candidato5 = candidato5 + 1;
            } else {
                 System.out.println("Número inválido");
            } 
            System.out.println("O candidato 1 teve: " + candidato1 + " votos");
            System.out.println("O candidato 2 teve: " + candidato2 + " votos");
            System.out.println("O candidato 3 teve: " + candidato3 + " votos");
            System.out.println("O candidato 4 teve: " + candidato4 + " votos");
            System.out.println("O candidato 5 teve: " + candidato5 + " votos");
            System.out.println("Total de votos: " + candidato1 + candidato2 + candidato3+ candidato4 + candidato5);
           
        }
    }
    
}
