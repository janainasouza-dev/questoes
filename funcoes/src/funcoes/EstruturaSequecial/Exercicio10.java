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
public class Exercicio10 {
         public static void main(String[] args){
             Scanner entrada = new Scanner(System.in);
             System.out.println("Digite a altura do seu terreno: ");
             int altura  = entrada.nextInt();
             System.out.println("Digite a base  do seu terreno: ");
             int base  = entrada.nextInt();
          System.out.println("A area do terreno eh: " + ( base * altura));
        
         }
}



