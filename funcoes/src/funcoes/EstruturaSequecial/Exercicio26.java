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
public class Exercicio26 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         System.out.printf("Digite o raio do círculo:");
         double raio = entrada.nextDouble();
         double area = Math.PI * Math.pow(raio, 2);
         
         System.out.println("A aréa do circulo eh:" + area);
         
         entrada.close();
    }
   
}
