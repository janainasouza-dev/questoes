package funcoes.entidades;

public class Esfera {
    private double raio;
    private static final double PI = 3.1415;
    
    // Construtor
    public Esfera(double raio) {
        setRaio(raio);
    }
    
    // Setter com validação
    public void setRaio(double raio) {
        if (raio >= 0) {
            this.raio = raio;
        } else {
            System.out.println("ERRO: Raio não pode ser negativo!");
            this.raio = 0;
        }
    }
    
    public double getRaio() {
        return raio;
    }
    
    // Métodos de cálculo
    public double calcularArea() {
        return 4 * PI * Math.pow(raio, 2);
    }
    
    public double calcularVolume() {
        return (4.0 / 3.0) * PI * Math.pow(raio, 3);
    }
    
    public void exibirDados() {
        System.out.println("===== DADOS DA ESFERA =====");
        System.out.println("Raio: " + raio);
        System.out.printf("Área da superfície: %.2f\n", calcularArea());
        System.out.printf("Volume: %.2f\n", calcularVolume());
    }
}