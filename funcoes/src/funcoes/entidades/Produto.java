package funcoes.entidades;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço não pode ser negativo!");
        }
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    // Métodos de negócio
    public double valorTotalEstoque() {
        return preco * quantidade;
    }
    
    public void entradaEstoque(int qtd) {
        if (qtd > 0) {
            quantidade += qtd;
            System.out.println("Entrada de " + qtd + " unidades realizada!");
        } else {
            System.out.println("Quantidade inválida!");
        }
    }
    
    public void saidaEstoque(int qtd) {
        if (qtd > 0 && qtd <= quantidade) {
            quantidade -= qtd;
            System.out.println("Saída de " + qtd + " unidades realizada!");
        } else {
            System.out.println("Quantidade insuficiente em estoque!");
        }
    }
    
    public void exibirDados() {
        System.out.println("===== DADOS DO PRODUTO =====");
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Valor total: R$ %.2f\n", valorTotalEstoque());
    }
}