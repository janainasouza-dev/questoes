/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.aplicacao;

/**
 *
 * @author jana
 */
import funcoes.entidades.Piramide;
import java.util.Scanner;

public class AppPiramide {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== CÁLCULO DO VOLUME DA PIRÂMIDE ===");
        System.out.print("Digite a área da base: ");
        double base = entrada.nextDouble();
        
        System.out.print("Digite a altura: ");
        double altura = entrada.nextDouble();
        
        Piramide piramide = new Piramide(base, altura);
        piramide.exibirDados();
        
        entrada.close();
    }
}

