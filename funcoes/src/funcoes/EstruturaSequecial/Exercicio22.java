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
public class Exercicio22 {
    public static void main (String[] args){
      Scanner entrada = new Scanner(System.in);
        int horasNormais = entrada.nextInt();
        int horasExtras = entrada.nextInt();
        double bruto = horasNormais * 10 + horasExtras * 15;
        double liquido = bruto * 0.90;
        System.out.println("Bruto: " + bruto);
        System.out.println("Líquido:" + liquido);
        
        
        
    }
}
