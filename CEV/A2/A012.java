/** Exercício Java 012:
 * Faça um algoritmo que leia o preço de um produto e mostre seu novo preço, com 5% de desconto.
 * */

package CEV.A2;

import java.util.Scanner;
public class A012 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço original do produto: ");
        float ValorOriginal =  entrada.nextFloat();

        float ValorDesconto = ValorOriginal - (ValorOriginal * 5/100);  // float ValorDesconto = ValorOriginal * 0.95f;

        System.out.printf("Valor original: %.2f\n", ValorOriginal);
        System.out.printf("Valor original: %.2f", ValorDesconto);

    }
}
