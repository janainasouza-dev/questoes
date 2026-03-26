/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.entidades;

/**
 *
 * @author jana
 */

public class Piramide {
    private double base;
    private double altura;
    
    public Piramide(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }
    
    // Getters e Setters com validação
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        if (base >= 0) {
            this.base = base;
        } else {
            System.out.println("ERRO: Base não pode ser negativa!");
            this.base = 0;
        }
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        if (altura >= 0) {
            this.altura = altura;
        } else {
            System.out.println("ERRO: Altura não pode ser negativa!");
            this.altura = 0;
        }
    }
    
    // Método para calcular volume
    public double calcularVolume() {
        return (1.0 / 3.0) * base * altura;
    }
    
    public void exibirDados() {
        System.out.println("===== DADOS DA PIRÂMIDE =====");
        System.out.println("Área da base: " + base);
        System.out.println("Altura: " + altura);
        System.out.printf("Volume: %.2f\n", calcularVolume());
    }
}

