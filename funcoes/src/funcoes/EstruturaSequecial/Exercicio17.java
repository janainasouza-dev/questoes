/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaSequecial;
import java.util.Scanner;
/**
 *
 * @author jana
 */
public class Exercicio17 {
   public static  void main(String[] args){
       Scanner entrada = new Scanner(System.in);
       int p = entrada.nextInt();
       int m = entrada.nextInt();
       int g = entrada.nextInt();
       int totalCamisetas =  p * 10 + m * 12 + g * 15;
       System.out.println("Total arrecadado eh: " + totalCamisetas);
       
 
   } 
}
