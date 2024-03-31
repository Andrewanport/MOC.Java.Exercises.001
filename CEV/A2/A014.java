/** Exercício Java 014:
 * Escreva um programa que converta uma temperatura digitando em graus Celsius e converta para graus Fahrenheit.
 * Utilize: F = C x 1,8 + 32.
 * */

package CEV.A2;

import java.util.Scanner;

public class A014 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor em Celsius: ");
        float Celsius = entrada.nextFloat();

        float Fahrenheit = Celsius * 1.8f + 32f;

        System.out.printf("Valor em celsius: %.2f\n", Celsius);
        System.out.printf("Valor em celsius: %.2f", Fahrenheit);

    }
}
