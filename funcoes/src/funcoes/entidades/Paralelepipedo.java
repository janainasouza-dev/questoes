/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.entidades;

/**
 *
 * @author jana
 */
public class Paralelepipedo {
    private double altura;
    private double largura;
    private double comprimento;
    
    public Paralelepipedo(double altura, double largura, double comprimento) {
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }
    
    // Getters e Setters
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    
    public double getLargura() { return largura; }
    public void setLargura(double largura) { this.largura = largura; }
    
    public double getComprimento() { return comprimento; }
    public void setComprimento(double comprimento) { this.comprimento = comprimento; }
    
    // Métodos de cálculo
    public double calcularVolume() {
        return altura * largura * comprimento;
    }
    
    public double calcularArea() {
        return 2 * (altura * largura + altura * comprimento + largura * comprimento);
    }
    
    public void exibirDados() {
        System.out.println("===== DADOS DO PARALELEPÍPEDO =====");
        System.out.println("Altura: " + altura);
        System.out.println("Largura: " + largura);
        System.out.println("Comprimento: " + comprimento);
        System.out.printf("Área: %.2f\n", calcularArea());
        System.out.printf("Volume: %.2f\n", calcularVolume());
    }
}
