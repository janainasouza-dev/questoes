package funcoes.aplicacao;

import funcoes.entidades.Pessoa;
import java.util.Scanner;

public class AppPessoa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== CADASTRO DE PESSOA ===");
        
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Peso (kg): ");
        double peso = entrada.nextDouble();
        
        System.out.print("Altura (m): ");
        double altura = entrada.nextDouble();
        
        System.out.print("Sexo (M/F): ");
        char sexo = entrada.next().charAt(0);
        
        // Criando objeto
        Pessoa pessoa = new Pessoa(nome, peso, altura, sexo);
        
        // Exibindo dados
        pessoa.exibirDados();
        
        entrada.close();
    }
}