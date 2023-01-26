/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication46;
import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       int array []= new int [10];
       int i, j, temp;
       
       System.out.println("Digite 10 números: ");
       for (i = 0; i < 10; i++){
           entrada = next.Int(array);
       }  for (i = 0; i < 10; i++){
           for (j = i + 1; j < 10; j++){
               if (i > j ) {
                   temp = i;
                   i = j;
                   j= temp;
               }
           }
       } 
       System.out.println("Ordem crescente: ");
       for (i= 0; i < 10; i ++) {
           System.out.println(i);
       }
    }
    
}
