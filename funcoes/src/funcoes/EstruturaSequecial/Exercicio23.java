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
public class Exercicio23 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int frangos = entrada.nextInt();
        double total = frangos * (4.0 + 2 * 3.50);
        System.out.println("Gasto total = " +  total);
    }
}
