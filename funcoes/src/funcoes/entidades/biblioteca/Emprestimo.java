/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.entidades.biblioteca;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author jana
 */
public class Emprestimo {
    private Pessoa pessoa;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private boolean devolvido;
    
    public Emprestimo(Pessoa pessoa, Livro livro) {
        this.pessoa = pessoa;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
        this.devolvido = false;
        
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            System.out.println("✅ Empréstimo realizado com sucesso!");
        } else {
            System.out.println("❌ ERRO: Livro não está disponível!");
        }
    }
    
    public void devolver() {
        if (!devolvido) {
            this.dataDevolucao = LocalDate.now();
            this.devolvido = true;
            this.livro.setDisponivel(true);
            System.out.println("✅ Livro devolvido com sucesso!");
        } else {
            System.out.println("❌ Este livro já foi devolvido!");
        }
    }
    
    public void exibirDados() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("\n===== DADOS DO EMPRÉSTIMO =====");
        System.out.println("Pessoa: " + pessoa.getNome());
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Data empréstimo: " + dataEmprestimo.format(formato));
        System.out.println("Status: " + (devolvido ? "DEVOLVIDO" : "EM ANDAMENTO"));
        
        if (devolvido && dataDevolucao != null) {
            System.out.println("Data devolução: " + dataDevolucao.format(formato));
        }
    }
}

