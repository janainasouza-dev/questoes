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
public class Exercicio14 {
        public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de gasolina desejada: ");
        float litrosGasolina = entrada.nextFloat();
        System.out.println("Preço total da gasolina: " + litrosGasolina * 6.30);
    }
}
