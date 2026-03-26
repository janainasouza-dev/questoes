/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.entidades.supermercado;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author jana
 */
public class Pedido {
    private List<ItemPedido> itens;
    private String formaPagamento;
    
    public Pedido(String formaPagamento) {
        this.itens = new ArrayList<>();
        this.formaPagamento = formaPagamento;
    }
    
    public void adicionarItem(Produto produto, int quantidade) {
        if (produto.temEstoque(quantidade)) {
            itens.add(new ItemPedido(produto, quantidade));
            produto.reduzirEstoque(quantidade);
            System.out.println("✅ " + quantidade + "x " + produto.getNome() + " adicionado ao pedido!");
        } else {
            System.out.println("❌ Estoque insuficiente para " + produto.getNome());
        }
    }
    
    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }
    
    public void exibirResumo() {
        System.out.println("\n===== RESUMO DO PEDIDO =====");
        System.out.println("Forma de pagamento: " + formaPagamento);
        System.out.println("\nITENS:");
        for (ItemPedido item : itens) {
            System.out.println("  " + item);
        }
        System.out.printf("\nTOTAL: R$ %.2f\n", calcularTotal());
    }
}
