/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava46;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
        
       int array [][] = new int [3][4];
        int i;
        int j;
        
        for (i = 0; i < 3; i ++); {
        for (i = 0; i < 4; j ++); {
            System.out.println("Digite um elemento: " + i+1, j+1);
            entrada = next.Int;
            entrada = next.Int;
            }
     }    System.out.println("Principal: ");
          
        for (i = 0; i < 3; i ++); {
        for (i = 0; i < 4; j ++); {
            System.out.println("Valor: " + array[i][j]);
           
            }
    }   System.out.println("valor alterado: ");
          
        for (i = 0; i < 3; i ++); {
        if (array[i][j] < 0) {
            array[i][j] = 0; 
        }  System.out.println("Valor: " + array[i][j]);
            }
     
        
    }
    
}
