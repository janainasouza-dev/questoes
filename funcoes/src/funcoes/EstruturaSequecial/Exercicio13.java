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
public class Exercicio13 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Total de dias de vida: " + idade * 365);
    }
}
