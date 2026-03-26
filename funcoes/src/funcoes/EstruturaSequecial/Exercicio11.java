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
public class Exercicio11 {
    
        public static void main(String[] args)
        {
        Scanner entrada = new Scanner(System.in);      
        System.out.println("Quantos cavalos vc tem: ");
        int cavalo  = entrada.nextInt();
        System.out.println("A quantia de ferraduras necessarias sao: " + (cavalo*4));
        }
}
