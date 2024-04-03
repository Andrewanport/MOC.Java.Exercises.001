/** Exercício Java 023:
 Faça um programa que leia um número de 0 a 9999 e mostre na tela um dos dígitos separados
 */

package CEV.A3;

import java.util.Scanner;

public class A023 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro de 0 - 9999: ");
        int N = scanner.nextInt();

        int U = N / 1 % 10;
        int D = N / 10 % 10;
        int C = N / 100 % 10;
        int M = N / 1000 % 10;

        System.out.printf("Número digitado: %d\n", N);
        System.out.printf("Unidade: %d\n", U);
        System.out.printf("Dezena: %d\n", D);
        System.out.printf("Centena: %d\n", C);
        System.out.printf("Milhar: %d\n", M);

    }
}
