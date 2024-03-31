/** Exercício Java 008: Escreva um programa que leia um valor em metros e o exiba convertido em centímetros e milímetros. */

package CEV.A1;

import java.util.Scanner;

public class A008 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor em metros: ");
        float M = entrada.nextFloat();

        float C = M * 100;
        float m = M * 1000;

        System.out.printf("Valor em metros: %.2f\n", M);
        System.out.printf("Valor em Centímetros: %.2f\n", C);
        System.out.printf("Valor em milímetros: %.2f\n", m);

    }
}
