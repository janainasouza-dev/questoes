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
public class Exercicio19 {
    public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);
         double salario = entrada.nextDouble();
         double comAumento = salario * 1.15; 
         double comImposto = comAumento * 0.92;
         System.out.println("Salario inicial: " + salario);
         System.out.println("Salario com aumento: " + comAumento);
         System.out.println("Salario com imposto: " + comImposto);
    }
}
