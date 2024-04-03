/** Exercício Java 026:
 Faça um programa que leia uma frase pelo teclado e mostre quantas vezes aparece a letra "A",
 em que posição ela aparece a primeira vez e em que posição ela aparece a última vez.
 */

package CEV.A3;

import java.util.Scanner;
import java.util.Scanner;

public class A026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine().toUpperCase().strip();

        // Conta o número de ocorrências da letra 'A' na frase
        int quantidadeA = contarCaracteres(frase, 'A');

        // Encontra a primeira posição da letra 'A' na frase
        int primeiraPosicao = encontrarPrimeiraPosicao(frase, 'A');

        // Encontra a última posição da letra 'A' na frase
        int ultimaPosicao = encontrarUltimaPosicao(frase, 'A');

        System.out.printf("A letra A aparece: %d vezes\n", quantidadeA);
        System.out.printf("A letra A aparece primeiro na posição: %d\n", primeiraPosicao);
        System.out.printf("A letra A aparece por último na posição: %d\n", ultimaPosicao);

        System.out.println(frase);
    }

    // Método para contar o número de ocorrências de um caractere em uma string
    public static int contarCaracteres(String str, char caractere) {
        int contador = 0;
        for (char c : str.toCharArray()) {
            if (c == caractere) {
                contador++;
            }
        }
        return contador;
    }

    // Método para encontrar a primeira posição de um caractere em uma string
    public static int encontrarPrimeiraPosicao(String str, char caractere) {
        return str.indexOf(caractere) + 1;
    }

    // Método para encontrar a última posição de um caractere em uma string
    public static int encontrarUltimaPosicao(String str, char caractere) {
        return str.lastIndexOf(caractere) + 1;
    }
}

