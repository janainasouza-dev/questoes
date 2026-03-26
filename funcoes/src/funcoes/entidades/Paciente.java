/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.entidades;

/**
 *
 * @author jana
 */
public class Paciente {
    private String nome;
    private double peso;
    private double altura;
    
    public Paciente(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    
    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    
    // Métodos de cálculo
    public double calcularIMC() {
        return peso / (altura * altura);
    }
    
    public String classificarIMC() {
        double imc = calcularIMC();
        
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade grau I";
        } else if (imc < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }
    
    public void exibirDados() {
        System.out.println("===== DADOS DO PACIENTE =====");
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.printf("IMC: %.2f\n", calcularIMC());
        System.out.println("Classificação: " + classificarIMC());
    }
}
