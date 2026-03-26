/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.aplicacao;
import java.util.Scanner;
import funcoes.entidades.CurrencyConverter;
/**
 *
 * @author jana
 */

public class AppConversorMoeda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== CONVERSOR DE MOEDAS ===");
        System.out.print("Qual a cotação do dólar? R$ ");
        double cotacao = entrada.nextDouble();
        
        System.out.print("Quantos dólares você vai comprar? US$ ");
        double dolares = entrada.nextDouble();
        
        CurrencyConverter.exibirConversao(cotacao, dolares);
        
        entrada.close();
    }
}
