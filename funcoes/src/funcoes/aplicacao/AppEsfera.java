package funcoes.aplicacao;

import funcoes.entidades.Esfera;
import java.util.Scanner;

public class AppEsfera {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== CÁLCULO DA ESFERA ===");
        System.out.print("Digite o raio da esfera: ");
        double raio = entrada.nextDouble();
        
        Esfera esfera = new Esfera(raio);
        esfera.exibirDados();
        
        entrada.close();
    }
}