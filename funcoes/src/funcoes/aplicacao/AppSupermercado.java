/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.aplicacao;
import funcoes.entidades.supermercado.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author jana
 */
public class AppSupermercado {
    private static List<Produto> produtos = new ArrayList<>();
    private static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcao;
        
        inicializarProdutos();
        
        do {
            exibirMenu();
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcao) {
                case 1:
                    listarProdutos();
                    break;
                case 2:
                    realizarPedido();
                    break;
                case 3:
                    cadastrarProduto();
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        
        entrada.close();
    }
    
    private static void exibirMenu() {
        System.out.println("\n=== SUPERMERCADO BEM-BÃO ===");
        System.out.println("1. Listar Produtos");
        System.out.println("2. Realizar Pedido");
        System.out.println("3. Cadastrar Produto");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    private static void inicializarProdutos() {
        produtos.add(new Produto("Arroz 5kg", 25.90, 50));
        produtos.add(new Produto("Feijão 1kg", 8.50, 100));
        produtos.add(new Produto("Açúcar 1kg", 4.50, 80));
        produtos.add(new Produto("Café 500g", 12.90, 40));
        produtos.add(new Produto("Leite 1L", 5.20, 60));
    }
    
    private static void listarProdutos() {
        System.out.println("\n--- PRODUTOS DISPONÍVEIS ---");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println((i + 1) + " - " + produtos.get(i));
        }
    }
    
    private static void cadastrarProduto() {
        System.out.println("\n--- CADASTRAR PRODUTO ---");
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Preço: R$ ");
        double preco = entrada.nextDouble();
        
        System.out.print("Quantidade em estoque: ");
        int quantidade = entrada.nextInt();
        
        produtos.add(new Produto(nome, preco, quantidade));
        System.out.println("✅ Produto cadastrado com sucesso!");
    }
    
    private static void realizarPedido() {
        System.out.println("\n--- NOVO PEDIDO ---");
        System.out.print("Forma de pagamento (Dinheiro/Cheque/Cartão): ");
        String formaPagamento = entrada.nextLine();
        
        Pedido pedido = new Pedido(formaPagamento);
        
        int opcao;
        do {
            listarProdutos();
            System.out.print("Digite o número do produto (0 para finalizar): ");
            opcao = entrada.nextInt();
            
            if (opcao > 0 && opcao <= produtos.size()) {
                System.out.print("Quantidade: ");
                int quantidade = entrada.nextInt();
                pedido.adicionarItem(produtos.get(opcao - 1), quantidade);
            } else if (opcao != 0) {
                System.out.println("Produto inválido!");
            }
        } while (opcao != 0);
        
        pedido.exibirResumo();
    }
}

