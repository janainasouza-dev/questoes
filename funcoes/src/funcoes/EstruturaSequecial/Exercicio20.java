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
public class Exercicio20 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int sanduiches = entrada.nextInt();
        double queijo = sanduiches * 2 * 50 / 1000.0;
        double presunto = sanduiches * 1 * 50 / 1000.0;
        double carne = sanduiches * 1 * 100 / 1000.0;
        System.out.println("Queijo: " + queijo);
        System.out.println("Presunto: " + presunto);
        System.out.println("Carne: " + carne);

    }
}
