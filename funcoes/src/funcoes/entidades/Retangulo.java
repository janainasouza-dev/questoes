/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.entidades;

/**
 *
 * @author jana
 */
public class Retangulo {
    private double comprimento;
    private double largura;
    
    public Retangulo(double comprimento, double largura) {
        setComprimento(comprimento);
        setLargura(largura);
    }
    
    // Setters com validação
    public void setComprimento(double comprimento) {
        if (comprimento >= 0) {
            this.comprimento = comprimento;
        } else {
            System.out.println("ERRO: Comprimento não pode ser negativo!");
            this.comprimento = 0;
        }
    }
    
    public void setLargura(double largura) {
        if (largura >= 0) {
            this.largura = largura;
        } else {
            System.out.println("ERRO: Largura não pode ser negativa!");
            this.largura = 0;
        }
    }
    
    public double getComprimento() { return comprimento; }
    public double getLargura() { return largura; }
    
    // Métodos de cálculo
    public double calcularArea() {
        return comprimento * largura;
    }
    
    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }
    
    public void exibirDados() {
        System.out.println("===== DADOS DO RETÂNGULO =====");
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Largura: " + largura);
        System.out.printf("Área: %.2f\n", calcularArea());
        System.out.printf("Perímetro: %.2f\n", calcularPerimetro());
    }
}


