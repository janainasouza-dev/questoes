/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.entidades;

/**
 *
 * @author jana
 */
public class Conta {
    private final int numeroConta;
    private String nomeTitular;
    private double saldo;
    
    // Construtor sem depósito inicial
    public Conta(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }
    
    // Construtor com depósito inicial
    public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        depositar(depositoInicial);
    }
    
    // Getters (não tem setter para número e saldo)
    public int getNumeroConta() {
        return numeroConta;
    }
    
    public String getNomeTitular() {
        return nomeTitular;
    }
    
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    // Métodos de negócio
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado!\n", valor);
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }
    
    public void sacar(double valor) {
        double valorComTaxa = valor + 5.0;
        
        if (valor > 0) {
            saldo -= valorComTaxa;
            System.out.printf("Saque de R$ %.2f realizado!\n", valor);
            System.out.println("Taxa de R$ 5,00 cobrada.");
        } else {
            System.out.println("Valor de saque inválido!");
        }
    }
    
    public void exibirDados() {
        System.out.printf("Conta Número: %d, Proprietário: %s, Saldo: R$ %.2f\n", 
                          numeroConta, nomeTitular, saldo);
    }
}
