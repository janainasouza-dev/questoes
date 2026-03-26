/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaSequecial;

import java.util.Scanner;

/**
 *
 * @author 202512170016
 */

    public class Exercicio08 {
         public static void main(String[] args){
             Scanner entrada = new Scanner(System.in);
             System.out.println("Entre com o valor em salario");
             double salario  = entrada.nextDouble();
             double aumento = salario * 1.15;
          System.out.println("Seu salario eh: " + (aumento));
        
         }
}

