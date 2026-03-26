/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.aplicacao;
import funcoes.entidades.Paciente;
import java.util.Scanner;
/**
 *
 * @author jana
 */

public class AppPaciente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== CADASTRO DO PACIENTE ===");
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Peso (kg): ");
        double peso = entrada.nextDouble();
        
        System.out.print("Altura (m): ");
        double altura = entrada.nextDouble();
        
        Paciente paciente = new Paciente(nome, peso, altura);
        paciente.exibirDados();
        
        entrada.close();
    }
}
