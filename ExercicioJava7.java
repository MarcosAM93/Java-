/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horasfuncionario;

import java.util.Scanner;
public class HorasFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner (System.in);
       
       System.out.println("Entre o número do funcionário: ");
       int funcionario = entrada.nextInt();
       System.out.println("Horas trabalhadas: ");
       int horas = entrada.nextInt();
       System.out.println("Valor por Hora: ");
       float valor_hora = entrada.nextFloat();
       float salario = horas * valor_hora;
       
       System.out.println("Funcionário: " + funcionario + " Salário: " + salario);
       
       
       
               
    }
    
}
