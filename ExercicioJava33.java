/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava33;
import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
      
      int senha = entrada.nextInt();
      while (senha < 2023) {
          System.out.println ("Senha inválida");
          System.out.println ("Tente novamente");
          
          if (senha == 2023) {
              System.out.println("Acesso permitido");
          }
      }
    }
    
}
