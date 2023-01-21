/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava29;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
         
       System.out.println("Digite 1, 2 ou 3 = : ");
       int I = entrada.nextInt();
       System.out.println("A = : ");
       float A = entrada.nextFloat();
       System.out.println("B = : ");
       float B = entrada.nextFloat();
       System.out.println("C = : ");
       float C = entrada.nextFloat();
       
       
       if (I == 1) {
           if (A> B && B > C) {
               System.out.println(C, B, A);
           }  else if (A> C && C > B) {
               System.out.println(B, C, A);
           }   else if (B> A && A > C) {
               System.out.println(C, A, B);
           }   else if (B> C && C > A) {
               System.out.println(A, C, B);
           }   else if (C> A && A > C) {
               System.out.println(B, A, C);
           }   else if (C> B && B > A) {
               System.out.println(A, B, C);
           } 
       }
       if (I == 2) {
           if (A> B && B > C) {
               System.out.println(A, B, C);
           }  else if (A> C && C > B) {
               System.out.println(A, C, B);
           }   else if (A> C && C > B) {
               System.out.println(B, A, C);
           }   else if (A> C && C > B) {
               System.out.println(B, C, A);
           }   else if (A> C && C > B) {
               System.out.println(C, A, B);
           }   else if (A> C && C > B) {
               System.out.println(C, B, A);
           } 
       }
       if (I == 3) {
           if (A> B && B > C) {
               System.out.println(A);
           }   else if (B> A && A > C) {
               System.out.println(B);
           }   
       }   else {
           print (C)
       }
    }
    
}

