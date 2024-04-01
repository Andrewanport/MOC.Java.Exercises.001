/** Exercício Java 016:
 * Crie um programa que leia um número Real qualquer pelo teclado e mostre na tela a sua porção Inteira.
 * Ex: Digite um número: 6.127
 * O número 6.127 tem a parte Inteira 6.
 * */

package CEV.A2;

import java.util.Scanner;

public class A016 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor numérico qualquer: ");
        float N = entrada.nextFloat();

        int I = (int) N;

        System.out.printf("O valor digitado foi: %.2f\n", N);
        System.out.printf("O valor inteiro desse valor é: %d", I);

    }
}
