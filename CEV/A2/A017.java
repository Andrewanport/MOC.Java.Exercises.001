/** Exercício Java 017:
 * Crie um programa que leia um número Real qualquer pelo teclado e mostre na tela a sua porção Inteira.
 * Ex: Digite um número: 6.127
 * O número 6.127 tem a parte Inteira 6.
 * */

package CEV.A2;

import java.util.Scanner;
import java.math.*;

public class A017 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a medida do cateto (1): ");
        float C1 = entrada.nextFloat();

        System.out.print("Digite a medida do cateto (2): ");
        float C2 = entrada.nextFloat();

        Double H = Math.sqrt(Math.pow(C1, 2) + Math.pow(C2, 2));

        System.out.printf("O triângulo dos catetetos %.2f e %.2f possui uma hipotenusa de: %.2f", C1, C2, H);
    }
}
