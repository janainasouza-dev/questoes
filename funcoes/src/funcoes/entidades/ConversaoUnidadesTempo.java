/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.entidades;

/**
 *
 * @author jana
 */
public class ConversaoUnidadesTempo {
    
    // 1 minuto = 60 segundos
    public static double minutoParaSegundo(double minutos) {
        return minutos * 60;
    }
    
    public static double segundoParaMinuto(double segundos) {
        return segundos / 60;
    }
    
    // 1 hora = 60 minutos
    public static double horaParaMinuto(double horas) {
        return horas * 60;
    }
    
    public static double minutoParaHora(double minutos) {
        return minutos / 60;
    }
    
    // 1 dia = 24 horas
    public static double diaParaHora(double dias) {
        return dias * 24;
    }
    
    public static double horaParaDia(double horas) {
        return horas / 24;
    }
    
    // 1 semana = 7 dias
    public static double semanaParaDia(double semanas) {
        return semanas * 7;
    }
    
    public static double diaParaSemana(double dias) {
        return dias / 7;
    }
    
    // 1 mês = 30 dias
    public static double mesParaDia(double meses) {
        return meses * 30;
    }
    
    public static double diaParaMes(double dias) {
        return dias / 30;
    }
    
    // 1 ano = 365.25 dias
    public static double anoParaDia(double anos) {
        return anos * 365.25;
    }
    
    public static double diaParaAno(double dias) {
        return dias / 365.25;
    }
    
    // Menu interativo
    public static void exibirMenu() {
        System.out.println("\n=== CONVERSOR DE UNIDADES DE TEMPO ===");
        System.out.println("1. Minuto → Segundo");
        System.out.println("2. Segundo → Minuto");
        System.out.println("3. Hora → Minuto");
        System.out.println("4. Minuto → Hora");
        System.out.println("5. Dia → Hora");
        System.out.println("6. Hora → Dia");
        System.out.println("7. Semana → Dia");
        System.out.println("8. Dia → Semana");
        System.out.println("9. Mês → Dia");
        System.out.println("10. Dia → Mês");
        System.out.println("11. Ano → Dia");
        System.out.println("12. Dia → Ano");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    public static void realizarConversao(int opcao, double valor) {
        double resultado = 0;
        
        switch (opcao) {
            case 1:
                resultado = minutoParaSegundo(valor);
                System.out.printf("%.2f min = %.2f seg\n", valor, resultado);
                break;
            case 2:
                resultado = segundoParaMinuto(valor);
                System.out.printf("%.2f seg = %.2f min\n", valor, resultado);
                break;
            case 3:
                resultado = horaParaMinuto(valor);
                System.out.printf("%.2f h = %.2f min\n", valor, resultado);
                break;
            case 4:
                resultado = minutoParaHora(valor);
                System.out.printf("%.2f min = %.2f h\n", valor, resultado);
                break;
            case 5:
                resultado = diaParaHora(valor);
                System.out.printf("%.2f dias = %.2f h\n", valor, resultado);
                break;
            case 6:
                resultado = horaParaDia(valor);
                System.out.printf("%.2f h = %.2f dias\n", valor, resultado);
                break;
            case 7:
                resultado = semanaParaDia(valor);
                System.out.printf("%.2f semanas = %.2f dias\n", valor, resultado);
                break;
            case 8:
                resultado = diaParaSemana(valor);
                System.out.printf("%.2f dias = %.4f semanas\n", valor, resultado);
                break;
            case 9:
                resultado = mesParaDia(valor);
                System.out.printf("%.2f meses = %.2f dias\n", valor, resultado);
                break;
            case 10:
                resultado = diaParaMes(valor);
                System.out.printf("%.2f dias = %.2f meses\n", valor, resultado);
                break;
            case 11:
                resultado = anoParaDia(valor);
                System.out.printf("%.2f anos = %.2f dias\n", valor, resultado);
                break;
            case 12:
                resultado = diaParaAno(valor);
                System.out.printf("%.2f dias = %.4f anos\n", valor, resultado);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
