/** Exercício Java 003: Crie um programa que leia dois números e mostre a soma entre eles. */

package CEV.A1;

import java.util.Scanner;
public class A003 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número (1): ");
        float N1 = entrada.nextFloat();

        System.out.print("Digite um número (2): ");
        float N2 = entrada.nextFloat();

        float S = N1 + N2;

        System.out.printf("A soma entre %.2f e %.2f é de %.2f", N1, N2, S);
    }
}
