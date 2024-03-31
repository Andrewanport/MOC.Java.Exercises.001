/** Exercício Java 007: Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre a sua média. */

package CEV.A1;

import java.util.Scanner;

public class A007 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma nota (1): ");
        float N1 = entrada.nextFloat();

        System.out.print("Digite uma nota (2): ");
        float N2 = entrada.nextFloat();

        float M = (N1 + N2) / 2;

        System.out.printf("Média do aluno: %.1f", M);

    }
}
