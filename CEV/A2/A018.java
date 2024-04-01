/** Exercício Java 018:
    Faça um programa que leia um ângulo qualquer e mostre na tela o valor do seno, cosseno e tangente desse ângulo.
 */

package CEV.A2;

import java.util.Scanner;
import java.math.*;
public class A018 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite  o valor de um ângulo qualquer: ");
        float A = entrada.nextFloat();

        double Sen = Math.sin(A);
        double Cos = Math.cos(A);
        double Tan = Math.tan(A);

        System.out.printf("O valor digitado foi: %.2f\n", A);

        System.out.printf("Seno: %.2f\n", Sen);
        System.out.printf("Coseno: %.2f\n", Cos);
        System.out.printf("Tangente: %.2f", Tan);

    }
}
