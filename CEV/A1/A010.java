/** Exercício Java 010:
 *  Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos dólares ela pode comprar.
 *  Considere: US$ 1.00 = R$ 4.93
 */

package CEV.A1;

import java.sql.SQLOutput;
import java.util.Scanner;
public class A010 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite um valor: R$ ");;
        float R = entrada.nextFloat();

        float D = (R * 4.87f);

        System.out.printf("Valor em Real: R$%.2f\n", R);
        System.out.printf("Valor em Dolar: $%.2f", D);
    }
}
