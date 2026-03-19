package funcoes.entidades;

public class Pessoa {
    // ATRIBUTOS (sempre privados - encapsulamento)
    private String nome;
    private double peso;
    private double altura;
    private char sexo;
    
    // CONSTRUTOR
    public Pessoa(String nome, double peso, double altura, char sexo) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }
    
    // GETTERS E SETTERS
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public char getSexo() {
        return sexo;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    // MÉTODOS DE NEGÓCIO
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
        System.out.println("===== DADOS DA PESSOA =====");
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Sexo: " + sexo);
        System.out.printf("IMC: %.2f\n", calcularIMC());
        System.out.println("Classificação: " + classificarIMC());
    }
}