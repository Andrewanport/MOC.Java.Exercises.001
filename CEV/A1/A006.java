/** Exercício Java 006: Crie um algoritmo que leia um número e mostre o seu dobro, triplo e raiz quadrada. */

package CEV.A1;


import java.util.Scanner;
import static java.lang.Math.sqrt;

public class A006 {
    public static void main(String[] args) {

        // Declaração e inicialização do Scanner para entrada de dados do usuário
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número qualquer: ");

        // Input da variável N
        float N = entrada.nextFloat();

        // Dobro
        float D = N * 2;

        // Triplo
        float T = N * 3;

        // Raiz quadrada
        float Q = (float) sqrt(N);

        System.out.printf("Número digitado: %.2f \n", N);
        System.out.printf("Dobro: %.2f \n", D);
        System.out.printf("Triplo: %.2f \n", T);
        System.out.printf("Raiz quadrada: %.2f \n", Q);
    }
}
