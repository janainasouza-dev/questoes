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
public class Exercicio25 {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int m1 = entrada.nextInt();
        int m5 = entrada.nextInt();
        int m10 = entrada.nextInt();
        int m25 = entrada.nextInt();
        int m50 = entrada.nextInt();
        int m100 = entrada.nextInt();
        double total = m1 * 0.01 + m5 * 0.05 + m10 * 0.10 + m25 * 0.25 + m50 * 0.50 + m100 * 1.0;
        System.out.println("Total economizado = " + total);    
    }
}
