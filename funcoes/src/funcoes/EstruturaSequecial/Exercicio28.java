/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.EstruturaSequecial;
import java.util.Scanner;
/**
 *
 * @author jana
 */
public class Exercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o valor em pés:");
        double pes = entrada.nextDouble();
        
        double jardas = pes * 3.0;
        double milhas = pes * 5280.0;
        
        System.out.println("-----Converção------");
        System.out.println("Sua medida em pés:" + pes);
        System.out.println("Sua medida em jardas:" + jardas);
        System.out.println("Sua medida em milhas:" + milhas);
        
        entrada.close();


    }
}
