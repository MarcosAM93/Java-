/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculararea;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class CalcularArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite o valor decimal de A: ");
        float A = entrada.nextFloat();
        System.out.println("Digite o valor decimal de B: ");
        float B = entrada.nextFloat();
        System.out.println("Digite o valor decimal de C: ");
        float C = entrada.nextFloat();
        
        double area_triangulo = (A * C)/2;
        double area_circulo = Math.PI * (C * C);
        double area_trapezio = ((A + B) * C) / 2;
        double area_quadrado = B * B;
        double area_retangulo = A * B;
        
        System.out.println("TRIANGULO: " + area_triangulo);
        System.out.println("CIRCULO: " + area_circulo);
        System.out.println("TRAPEZIO: " + area_trapezio);
        System.out.println("QUADRADO: " + area_quadrado);
        System.out.println("RETANGULO: " + area_retangulo);
       
    
}
