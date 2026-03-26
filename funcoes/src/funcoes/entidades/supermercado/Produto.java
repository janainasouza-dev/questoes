/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.entidades.supermercado;

/**
 *
 * @author jana
 */
public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    
    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public void setQuantidadeEstoque(int quantidadeEstoque) { 
        this.quantidadeEstoque = quantidadeEstoque; 
    }
    
    public boolean temEstoque(int quantidade) {
        return quantidadeEstoque >= quantidade;
    }
    
    public void reduzirEstoque(int quantidade) {
        if (temEstoque(quantidade)) {
            quantidadeEstoque -= quantidade;
        }
    }
    
    @Override
    public String toString() {
        return nome + " - R$ " + String.format("%.2f", preco) + 
               " (Estoque: " + quantidadeEstoque + ")";
    }
}

