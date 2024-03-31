/** Exercício Java 015:
 * Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado.
 * Calcule o preço a pagar, sabendo que o carro custa R$60 por dia e R$0.15 por KM rodado.
 * */

package CEV.A2;

import java.util.Scanner;
public class A015 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quilômetros percorridos: ");
        float KM = entrada.nextFloat();

        System.out.print("Dias alugados: ");
        float Dias = entrada.nextFloat();

        float ValorDias = (Dias * 60f);

        float ValorKM = (KM * 0.15f);

        float Total = ValorKM + ValorDias;

        System.out.printf("Valor por KM: %.2f\n", ValorKM);
        System.out.printf("Valor diária: %.2f\n", ValorDias);
        System.out.printf("Valor total: %.2f\n", Total);

    }
}
