/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idiomacomputador;

import java.util.Locale;

public class IdiomaComputador {

   
    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        String idioma = local.getDisplayLanguage();
        System.out.println("O idioma está em: " + idioma);
    }
    
}
