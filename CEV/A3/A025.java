/** Exercício Java 025:
 Crie um programa que leia o nome de uma cidade e diga se ela começa ou não com o nome "Santo"
 */

package CEV.A3;

import java.util.Scanner;
public class A025 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String N = scanner.nextLine().trim();

        Boolean NV = N.toUpperCase().contains("SILVA");

        System.out.printf("Seu nome possui 'SILVA'? %b\n", NV);

    }
}
