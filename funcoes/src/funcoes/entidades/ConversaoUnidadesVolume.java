/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.entidades;

/**
 *
 * @author jana
 */
public class ConversaoUnidadesVolume {
    
    // 1 litro = 1000 centímetros cúbicos
    public static double litroParaCm3(double litros) {
        return litros * 1000;
    }
    
    public static double cm3ParaLitro(double cm3) {
        return cm3 / 1000;
    }
    
    // 1 metro cúbico = 1000 litros
    public static double m3ParaLitro(double m3) {
        return m3 * 1000;
    }
    
    public static double litroParaM3(double litros) {
        return litros / 1000;
    }
    
    // 1 metro cúbico = 35.32 pés cúbicos
    public static double m3ParaPe3(double m3) {
        return m3 * 35.32;
    }
    
    public static double pe3ParaM3(double pe3) {
        return pe3 / 35.32;
    }
    
    // 1 galão americano = 231 polegadas cúbicas
    public static double galaoParaPol3(double galoes) {
        return galoes * 231;
    }
    
    public static double pol3ParaGalao(double pol3) {
        return pol3 / 231;
    }
    
    // 1 galão americano = 3.785 litros
    public static double galaoParaLitro(double galoes) {
        return galoes * 3.785;
    }
    
    public static double litroParaGalao(double litros) {
        return litros / 3.785;
    }
    
    // Menu interativo
    public static void exibirMenu() {
        System.out.println("\n=== CONVERSOR DE UNIDADES DE VOLUME ===");
        System.out.println("1. Litro → Centímetro³");
        System.out.println("2. Centímetro³ → Litro");
        System.out.println("3. Metro³ → Litro");
        System.out.println("4. Litro → Metro³");
        System.out.println("5. Metro³ → Pé³");
        System.out.println("6. Pé³ → Metro³");
        System.out.println("7. Galão → Polegada³");
        System.out.println("8. Polegada³ → Galão");
        System.out.println("9. Galão → Litro");
        System.out.println("10. Litro → Galão");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    public static void realizarConversao(int opcao, double valor) {
        double resultado = 0;
        
        switch (opcao) {
            case 1:
                resultado = litroParaCm3(valor);
                System.out.printf("%.2f L = %.2f cm³\n", valor, resultado);
                break;
            case 2:
                resultado = cm3ParaLitro(valor);
                System.out.printf("%.2f cm³ = %.2f L\n", valor, resultado);
                break;
            case 3:
                resultado = m3ParaLitro(valor);
                System.out.printf("%.2f m³ = %.2f L\n", valor, resultado);
                break;
            case 4:
                resultado = litroParaM3(valor);
                System.out.printf("%.2f L = %.6f m³\n", valor, resultado);
                break;
            case 5:
                resultado = m3ParaPe3(valor);
                System.out.printf("%.2f m³ = %.2f ft³\n", valor, resultado);
                break;
            case 6:
                resultado = pe3ParaM3(valor);
                System.out.printf("%.2f ft³ = %.2f m³\n", valor, resultado);
                break;
            case 7:
                resultado = galaoParaPol3(valor);
                System.out.printf("%.2f gal = %.2f in³\n", valor, resultado);
                break;
            case 8:
                resultado = pol3ParaGalao(valor);
                System.out.printf("%.2f in³ = %.4f gal\n", valor, resultado);
                break;
            case 9:
                resultado = galaoParaLitro(valor);
                System.out.printf("%.2f gal = %.3f L\n", valor, resultado);
                break;
            case 10:
                resultado = litroParaGalao(valor);
                System.out.printf("%.2f L = %.4f gal\n", valor, resultado);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
