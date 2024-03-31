/** Exercício Java 011:
 * Faça um programa que leia a largura e a altura de uma parede em metros,
 * calcule a sua área e a quantidade de tinta necessária para pintá-la,
 * sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.
 * Considere que cada litro de tinta pinta uma área de 2m².
 * */

package CEV.A2;

import java.util.Scanner;

public class A011 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a altura da sua parede: ");
        float Altura = entrada.nextFloat();

        System.out.print("Digite a largura da sua parede: ");
        float Largura = entrada.nextFloat();

        float Area = Altura * Largura;

        float tinta = (Altura * Largura) / 2;

        System.out.printf("Para uma área de %.2fm², são preciso(s): %.1f litro(s) de tinta ", Area, tinta);

    }

}

