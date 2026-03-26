/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.aplicacao;
import funcoes.entidades.ConversaoUnidadesArea;
import java.util.Scanner;
/**
 *
 * @author jana
 */
public class AppConversaoArea {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        
        do {
            ConversaoUnidadesArea.exibirMenu();
            opcao = entrada.nextInt();
            
            if (opcao == 0) {
                System.out.println("Encerrando programa...");
                break;
            }
            
            System.out.print("Digite o valor a converter: ");
            double valor = entrada.nextDouble();
            
            ConversaoUnidadesArea.realizarConversao(opcao, valor);
            
        } while (opcao != 0);
        
        entrada.close();
    }
}
