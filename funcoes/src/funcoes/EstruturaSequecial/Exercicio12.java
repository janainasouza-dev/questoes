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
public class Exercicio12 {
      public static void main(String[] args)
        {
        Scanner entrada = new Scanner(System.in);      
        System.out.println("Quantas broas foram vendidas: ");
        int broas  = entrada.nextInt();
        System.out.println("Quantas paes foram vendidas: ");
        int paes  = entrada.nextInt();
        double total = paes * 0.12 + broas * 1.50;
        double poupanca = total * 0.10;
        System.out.println("Rendimento total: " + total);
        System.out.println("Rendimento total: " + poupanca);
        }
}


