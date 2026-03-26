/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.aplicacao;
import funcoes.entidades.Retangulo;
import java.util.Scanner;

/**
 *
 * @author jana
 */
public class AppRetangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== CÁLCULO DO RETÂNGULO ===");
        System.out.print("Digite o comprimento: ");
        double comprimento = entrada.nextDouble();
        
        System.out.print("Digite a largura: ");
        double largura = entrada.nextDouble();
        
        Retangulo retangulo = new Retangulo(comprimento, largura);
        retangulo.exibirDados();
        
        entrada.close();
            }
}
