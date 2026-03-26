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
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x1 = entrada.nextDouble();
        double x2 = entrada.nextDouble();
        double y1 = entrada.nextDouble();
        double y2 = entrada.nextDouble();
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow( y2 - y1, 2));
        System.out.println("A distancia eh:" + distancia);

    }
}
