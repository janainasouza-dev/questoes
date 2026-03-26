/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.aplicacao;
import funcoes.entidades.biblioteca.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author jana
 */
public class AppBiblioteca {
    private static List<Livro> livros = new ArrayList<>();
    private static List<Pessoa> pessoas = new ArrayList<>();
    private static List<Emprestimo> emprestimos = new ArrayList<>();
    private static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcao;
        
        // Dados iniciais para teste
        inicializarDados();
        
        do {
            exibirMenu();
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    cadastrarPessoa();
                    break;
                case 3:
                    listarLivros();
                    break;
                case 4:
                    listarPessoas();
                    break;
                case 5:
                    realizarEmprestimo();
                    break;
                case 6:
                    realizarDevolucao();
                    break;
                case 7:
                    listarEmprestimos();
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
        System.out.println("\n=== SISTEMA DE BIBLIOTECA ===");
        System.out.println("1. Cadastrar Livro");
        System.out.println("2. Cadastrar Pessoa");
        System.out.println("3. Listar Livros");
        System.out.println("4. Listar Pessoas");
        System.out.println("5. Realizar Empréstimo");
        System.out.println("6. Realizar Devolução");
        System.out.println("7. Listar Empréstimos");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    private static void inicializarDados() {
        livros.add(new Livro("Java: Como Programar", "Deitel", "978-85-7522-1"));
        livros.add(new Livro("Clean Code", "Robert Martin", "978-85-508-1"));
        livros.add(new Livro("Design Patterns", "Erich Gamma", "978-85-7541-1"));
        
        pessoas.add(new Pessoa("João Silva", "123.456.789-00", "(11) 99999-1234"));
        pessoas.add(new Pessoa("Maria Santos", "987.654.321-00", "(11) 88888-5678"));
    }
    
    private static void cadastrarLivro() {
        System.out.println("\n--- CADASTRAR LIVRO ---");
        System.out.print("Título: ");
        String titulo = entrada.nextLine();
        
        System.out.print("Autor: ");
        String autor = entrada.nextLine();
        
        System.out.print("ISBN: ");
        String isbn = entrada.nextLine();
        
        livros.add(new Livro(titulo, autor, isbn));
        System.out.println("✅ Livro cadastrado com sucesso!");
    }
    
    private static void cadastrarPessoa() {
        System.out.println("\n--- CADASTRAR PESSOA ---");
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("CPF: ");
        String cpf = entrada.nextLine();
        
        System.out.print("Telefone: ");
        String telefone = entrada.nextLine();
        
        pessoas.add(new Pessoa(nome, cpf, telefone));
        System.out.println("✅ Pessoa cadastrada com sucesso!");
    }
    
    private static void listarLivros() {
        System.out.println("\n--- LISTA DE LIVROS ---");
        for (int i = 0; i < livros.size(); i++) {
            System.out.println((i + 1) + " - " + livros.get(i));
        }
    }
    
    private static void listarPessoas() {
        System.out.println("\n--- LISTA DE PESSOAS ---");
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println((i + 1) + " - " + pessoas.get(i));
        }
    }
    
    private static void realizarEmprestimo() {
        System.out.println("\n--- REALIZAR EMPRÉSTIMO ---");
        
        listarPessoas();
        System.out.print("Selecione a pessoa (número): ");
        int pessoaIndex = entrada.nextInt() - 1;
        
        listarLivros();
        System.out.print("Selecione o livro (número): ");
        int livroIndex = entrada.nextInt() - 1;
        
        if (pessoaIndex >= 0 && pessoaIndex < pessoas.size() && 
            livroIndex >= 0 && livroIndex < livros.size()) {
            
            Emprestimo emprestimo = new Emprestimo(pessoas.get(pessoaIndex), livros.get(livroIndex));
            emprestimos.add(emprestimo);
            emprestimo.exibirDados();
        } else {
            System.out.println("❌ Opção inválida!");
        }
    }
    
    private static void realizarDevolucao() {
        System.out.println("\n--- REALIZAR DEVOLUÇÃO ---");
        
        if (emprestimos.isEmpty()) {
            System.out.println("Não há empréstimos registrados!");
            return;
        }
        
        for (int i = 0; i < emprestimos.size(); i++) {
            System.out.println((i + 1) + " - " + emprestimos.get(i).toString());
        }
        
        System.out.print("Selecione o empréstimo para devolução: ");
        int index = entrada.nextInt() - 1;
        
        if (index >= 0 && index < emprestimos.size()) {
            emprestimos.get(index).devolver();
        } else {
            System.out.println("❌ Opção inválida!");
        }
    }
    
    private static void listarEmprestimos() {
        System.out.println("\n--- LISTA DE EMPRÉSTIMOS ---");
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum empréstimo registrado.");
        } else {
            for (Emprestimo e : emprestimos) {
                e.exibirDados();
            }
        }
    }
}
