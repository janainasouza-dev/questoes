/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.aplicacao;
import funcoes.entidades.Paralelepipedo;
import java.util.Scanner;
/**
 *
 * @author jana
 */
public class AppParalelepipedo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== CÁLCULO DO PARALELEPÍPEDO ===");
        System.out.print("Digite a altura: ");
        double altura = entrada.nextDouble();
        
        System.out.print("Digite a largura: ");
        double largura = entrada.nextDouble();
        
        System.out.print("Digite o comprimento: ");
        double comprimento = entrada.nextDouble();
        
        Paralelepipedo paralelepipedo = new Paralelepipedo(altura, largura, comprimento);
        paralelepipedo.exibirDados();
        
        entrada.close();
    }
}
