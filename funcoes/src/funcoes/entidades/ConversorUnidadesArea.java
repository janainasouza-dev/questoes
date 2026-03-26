/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.entidades;

/**
 *
 * @author jana
 */
public class ConversaoUnidadesArea {
    
    // 1 metro quadrado = 10.76 pés quadrados
    public static double metroQuadradoParaPeQuadrado(double metros) {
        return metros * 10.76;
    }
    
    public static double peQuadradoParaMetroQuadrado(double pes) {
        return pes / 10.76;
    }
    
    // 1 pé quadrado = 929 centímetros quadrados
    public static double peQuadradoParaCmQuadrado(double pes) {
        return pes * 929;
    }
    
    public static double cmQuadradoParaPeQuadrado(double cm) {
        return cm / 929;
    }
    
    // 1 milha quadrada = 640 acres
    public static double milhaQuadradaParaAcre(double milhas) {
        return milhas * 640;
    }
    
    public static double acreParaMilhaQuadrada(double acres) {
        return acres / 640;
    }
    
    // 1 acre = 43.560 pés quadrados
    public static double acreParaPeQuadrado(double acres) {
        return acres * 43560;
    }
    
    public static double peQuadradoParaAcre(double pes) {
        return pes / 43560;
    }
    
    // Menu interativo
    public static void exibirMenu() {
        System.out.println("\n=== CONVERSOR DE UNIDADES DE ÁREA ===");
        System.out.println("1. Metro² → Pé²");
        System.out.println("2. Pé² → Metro²");
        System.out.println("3. Pé² → Centímetro²");
        System.out.println("4. Centímetro² → Pé²");
        System.out.println("5. Milha² → Acre");
        System.out.println("6. Acre → Milha²");
        System.out.println("7. Acre → Pé²");
        System.out.println("8. Pé² → Acre");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    public static void realizarConversao(int opcao, double valor) {
        double resultado = 0;
        
        switch (opcao) {
            case 1:
                resultado = metroQuadradoParaPeQuadrado(valor);
                System.out.printf("%.2f m² = %.2f ft²\n", valor, resultado);
                break;
            case 2:
                resultado = peQuadradoParaMetroQuadrado(valor);
                System.out.printf("%.2f ft² = %.2f m²\n", valor, resultado);
                break;
            case 3:
                resultado = peQuadradoParaCmQuadrado(valor);
                System.out.printf("%.2f ft² = %.2f cm²\n", valor, resultado);
                break;
            case 4:
                resultado = cmQuadradoParaPeQuadrado(valor);
                System.out.printf("%.2f cm² = %.2f ft²\n", valor, resultado);
                break;
            case 5:
                resultado = milhaQuadradaParaAcre(valor);
                System.out.printf("%.2f milhas² = %.2f acres\n", valor, resultado);
                break;
            case 6:
                resultado = acreParaMilhaQuadrada(valor);
                System.out.printf("%.2f acres = %.6f milhas²\n", valor, resultado);
                break;
            case 7:
                resultado = acreParaPeQuadrado(valor);
                System.out.printf("%.2f acres = %.2f ft²\n", valor, resultado);
                break;
            case 8:
                resultado = peQuadradoParaAcre(valor);
                System.out.printf("%.2f ft² = %.6f acres\n", valor, resultado);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
