/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.aplicacao;
import funcoes.entidades.Conta;
import java.util.Scanner;
/**
 *
 * @author jana
 */
public class AppBanco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Conta conta;
        
        System.out.println("=== CADASTRO DE CONTA BANCÁRIA ===");
        
        System.out.print("Entre com o Número da Conta: ");
        int numero = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Entre com o nome do correntista: ");
        String nome = entrada.nextLine();
        
        System.out.print("Você deseja fazer um depósito inicial (y/n)? ");
        char resposta = entrada.nextLine().charAt(0);
        
        if (resposta == 'y' || resposta == 'Y') {
            System.out.print("Entre com o valor do depósito inicial: R$ ");
            double depositoInicial = entrada.nextDouble();
            conta = new Conta(numero, nome, depositoInicial);
        } else {
            conta = new Conta(numero, nome);
        }
        
        System.out.println("\n=== DADOS DA CONTA ===");
        conta.exibirDados();
        
        System.out.print("\nEntre com o valor do depósito: R$ ");
        double deposito = entrada.nextDouble();
        conta.depositar(deposito);
        
        System.out.println("\n=== DADOS ATUALIZADOS ===");
        conta.exibirDados();
        
        System.out.print("\nEntre com o valor do saque: R$ ");
        double saque = entrada.nextDouble();
        conta.sacar(saque);
        
        System.out.println("\n=== DADOS ATUALIZADOS ===");
        conta.exibirDados();
        
        entrada.close();
    }
}
