/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atribuicaomodulo;

/**
 *
 * @author marcos.amaral
 */
public class AtribuicaoModulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* variavel como numero inteiro*/
        int w = 4;
        w%= 3.33;
        /* variavel como numero flutuante */
        float w2 = 4;
        w2%= 3.33;
        
        System.out.println ("Valor Final: " + w);
        System.out.println ("Valor Final: " + w2);
    }
    
}
