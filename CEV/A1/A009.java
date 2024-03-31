/** Exercício Java 009: Faça um programa que leia um número Inteiro qualquer e mostre na tela a sua tabuada. */

package CEV.A1;

import java.util.Scanner;

public class A009 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int N = entrada.nextInt();


        System.out.printf("| %d x %d = %d  |\n", N, 1, (N * 1));
        System.out.printf("| %d x %d = %d |\n", N, 2, (N * 2));
        System.out.printf("| %d x %d = %d |\n", N, 3, (N * 3));
        System.out.printf("| %d x %d = %d |\n", N, 4, (N * 4));
        System.out.printf("| %d x %d = %d |\n", N, 5, (N * 5));
        System.out.printf("| %d x %d = %d |\n", N, 6, (N * 6));
        System.out.printf("| %d x %d = %d |\n", N, 7, (N * 7));
        System.out.printf("| %d x %d = %d |\n", N, 8, (N * 8));
        System.out.printf("| %d x %d = %d |\n", N, 9, (N * 9));
        System.out.printf("| %d x %d = %d |\n", N, 10, (N * 10));
    }
}
