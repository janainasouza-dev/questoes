/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.entidades;

/**
 *
 * @author jana
 */
public class Cone {
    private double raio;
    private double altura;
    private static final double PI = 3.1415;
    
    public Cone(double raio, double altura) {
        setRaio(raio);
        setAltura(altura);
    }
    
    // Setters com validação
    public void setRaio(double raio) {
        if (raio >= 0) {
            this.raio = raio;
        } else {
            System.out.println("ERRO: Raio não pode ser negativo!");
            this.raio = 0;
        }
    }
    
    public void setAltura(double altura) {
        if (altura >= 0) {
            this.altura = altura;
        } else {
            System.out.println("ERRO: Altura não pode ser negativa!");
            this.altura = 0;
        }
    }
    
    public double getRaio() { return raio; }
    public double getAltura() { return altura; }
    
    // Métodos de cálculo
    public double calcularGeratriz() {
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(raio, 2));
    }
    
    public double calcularAreaLateral() {
        return PI * raio * calcularGeratriz();
    }
    
    public double calcularAreaTotal() {
        return PI * raio * (calcularGeratriz() + raio);
    }
    
    public double calcularVolume() {
        return (1.0 / 3.0) * PI * Math.pow(raio, 2) * altura;
    }
    
    public void exibirDados() {
        System.out.println("===== DADOS DO CONE =====");
        System.out.println("Raio: " + raio);
        System.out.println("Altura: " + altura);
        System.out.printf("Geratriz: %.2f\n", calcularGeratriz());
        System.out.printf("Área Lateral: %.2f\n", calcularAreaLateral());
        System.out.printf("Área Total: %.2f\n", calcularAreaTotal());
        System.out.printf("Volume: %.2f\n", calcularVolume());
    }
}
