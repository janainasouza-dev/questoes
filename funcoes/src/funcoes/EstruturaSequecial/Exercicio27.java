/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.EstruturaSequecial;
import java.util.Scanner;
/**
 *
 * @author jana
 * 
 * Faça um programa em Linguagem Java, que leia um número positivo
maior que zero, calculo e mostre:
a) O número digitado ao quadrado;
b) O número digitado ao cubo;
c) A raiz quadrada do número digitad
 */
public class Exercicio27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite um numero:");
        int num = entrada.nextInt();
        int resultQuadrado = num * num;
        int resultCubo = num * num * num;
        double resultRaiz = Math.sqrt(num);
        System.out.println("Resultado ao quadrado:" + resultQuadrado);
        System.out.println("Resultado ao cubo:" + resultCubo);
        System.out.println("Resuldado da raiz:" + resultRaiz);

    }
}
