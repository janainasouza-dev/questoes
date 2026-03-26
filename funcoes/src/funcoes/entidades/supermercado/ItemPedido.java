/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.entidades.supermercado;

/**
 *
 * @author jana
 */
public class ItemPedido {
    private Produto produto;
    private int quantidade;
    
    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    public Produto getProduto() { return produto; }
    public int getQuantidade() { return quantidade; }
    
    public double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }
    
    @Override
    public String toString() {
        return quantidade + "x " + produto.getNome() + 
               " - R$ " + String.format("%.2f", calcularSubtotal());
    }
}

