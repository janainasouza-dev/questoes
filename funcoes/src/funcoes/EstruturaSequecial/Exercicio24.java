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
public class Exercicio24 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int lata = entrada.nextInt();
        int garrafa600 = entrada.nextInt();
        int garrafa2l = entrada.nextInt();
        double totalLitros = lata * 0.35 + garrafa600 * 0.6 + garrafa2l * 2;
        System.out.println("Total de litros = " + totalLitros);

    }
    
}
