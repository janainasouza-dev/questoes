package funcoes.aplicacao;

import funcoes.entidades.Produto;
import java.util.Scanner;

public class AppProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== CADASTRO DE PRODUTO ===");
        
        System.out.print("Nome do produto: ");
        String nome = entrada.nextLine();
        
        System.out.print("Preço: R$ ");
        double preco = entrada.nextDouble();
        
        System.out.print("Quantidade em estoque: ");
        int quantidade = entrada.nextInt();
        
        // Criando produto
        Produto produto = new Produto(nome, preco, quantidade);
        
        // Exibindo dados iniciais
        produto.exibirDados();
        
        // Entrada no estoque
        System.out.print("\nDigite a quantidade para ENTRADA no estoque: ");
        int qtdEntrada = entrada.nextInt();
        produto.entradaEstoque(qtdEntrada);
        produto.exibirDados();
        
        // Saída do estoque
        System.out.print("\nDigite a quantidade para SAÍDA do estoque: ");
        int qtdSaida = entrada.nextInt();
        produto.saidaEstoque(qtdSaida);
        produto.exibirDados();
        
        entrada.close();
    }
}