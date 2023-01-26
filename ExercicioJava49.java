/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava49;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int numero;
        int numeros []= new int [6];
        Random randomizar = new Random ();
        
        for (int i = 0; i < numeros.length; i++); {
        numero = randomizar.nextInt(60) + 1;
        for (int j = 0; j < numeros.length; j++); {
            if (numero == numeros[j] && j != 1) {
                numero = randomizar.nextInt(60) + 1;
            } else {
                num[i] = numero;
            }
        }
      }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    
}
