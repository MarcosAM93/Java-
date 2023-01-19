/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojava17;

/**
 *
 * @author marcos.amaral
 */
public class ExercicioJava17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int a = 1;
        int b = 2;
        int c = 3;
        double delta;
        double x1;
        double x2;
        
        delta = (b * b) - (4 * a * c);
        
        x1 = (-b + (Math.sqrt(b * b - (4 * a * c))) / (2 * a));
        x2 = (-b + (Math.sqrt(b * b - (4 * a * c))) / (2 * a));
        
        System.out.println("x1 = " + x1 + "/n x2 = " + x2 + "Delta: " + delta);
        
    }
    
}
