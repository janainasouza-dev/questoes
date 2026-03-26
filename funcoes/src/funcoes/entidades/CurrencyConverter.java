/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.entidades;

/**
 *
 * @author jana
 */
public class CurrencyConverter {
    private static final double IOF = 0.06; // 6%
    
    // Método estático - não precisa criar objeto
    public static double converterDolarParaReal(double cotacaoDolar, double quantidadeDolares) {
        double valorSemIOF = quantidadeDolares * cotacaoDolar;
        double valorComIOF = valorSemIOF * (1 + IOF);
        return valorComIOF;
    }
    
    public static double calcularIOF(double valorEmReais) {
        return valorEmReais * IOF;
    }
    
    public static void exibirConversao(double cotacao, double dolares) {
        double valorTotal = converterDolarParaReal(cotacao, dolares);
        double valorSemIOF = dolares * cotacao;
        
        System.out.println("===== RESULTADO DA CONVERSÃO =====");
        System.out.printf("Cotação do dólar: R$ %.2f\n", cotacao);
        System.out.printf("Quantidade de dólares: US$ %.2f\n", dolares);
        System.out.printf("Valor em reais (sem IOF): R$ %.2f\n", valorSemIOF);
        System.out.printf("Valor do IOF (6%%): R$ %.2f\n", valorSemIOF * IOF);
        System.out.printf("Valor total a pagar: R$ %.2f\n", valorTotal);
    }
}
