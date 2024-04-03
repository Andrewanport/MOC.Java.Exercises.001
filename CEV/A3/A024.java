/** Exercício Java 024:
 Crie um programa que leia o nome de uma cidade e diga se ela começa ou não com o nome "Santo"
 */

package CEV.A3;

import java.util.Scanner;

public class A024 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de uma cidade: ");
        String N = scanner.nextLine();

        String NV = N.toUpperCase().split(" ")[0];

        System.out.println(NV.equals("SANTO"));
    }
}
