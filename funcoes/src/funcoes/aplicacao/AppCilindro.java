/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.aplicacao;
import funcoes.entidades.Cilindro;
import java.util.Scanner;

/**
 *
 * @author jana
 */
public class AppCilindro{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== CÁLCULO DO CILINDRO ===");
        System.out.print("Digite o raio: ");
        double raio = entrada.nextDouble();
        
        System.out.print("Digite a altura: ");
        double altura = entrada.nextDouble();
        
        Cilindro cilindro = new Cilindro(raio, altura);
        cilindro.exibirDados();
        
        entrada.close();
    }
}
