/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package identificartriangulo;

import java.util.Scanner;

/**
 *
 * @author marcos.amaral
 */
public class IdentificarTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite o lado A: ");
        int a = entrada.nextInt();
        System.out.println("Digite o lado B: ");
        int b = entrada.nextInt();
        System.out.println("Digite o lado C: ");
        int c = entrada.nextInt();
        
       if( a < b + c && b < a + c && c < a + b ){ 
			if(a == b && b == c){ 
				System.out.println("Triângulo é Eqüilátero.");
			}else if(a == b || a == c || b == c){ 
				System.out.println("Triângulo é Isósceles.");
			}else{ 
				System.out.println("Triângulo é Escaleno.");
			}
		}else{ 
			System.out.println("Não é triângulo");
		}
        
    }
    
}
