/** Exercício Java 022:
 Crie um programa que leia o nome completo de uma pessoa e mostra:
 O nome com todas as letras maiúsculas
 O nome com todas as letras minúsculas
 Quantas letras são sem considerar espaços.
 Quantas letras tem o primeiro nome?
 */

package CEV.A3;

import java.util.Scanner;

public class A022 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String Nome = entrada.nextLine();

        // Nome Maísculo
        String NomeMaiusculo = Nome.toUpperCase();

        // Nome Minusculo
        String NomeMinusculo = Nome.toLowerCase();

        // Número de Letras total
        int NumLetras = Nome.replace(" ", "").length();

        // Número de Letras do primeiro nome
        String PrimeiroNome = Nome.split(" ")[0];
        int NumLetrasPrimeiro = PrimeiroNome.length();


        System.out.printf("Nome completo: %s\n", Nome);
        System.out.printf("Nome completo (Maiúsculo): %s\n", NomeMaiusculo);
        System.out.printf("Nome completo (Minúsculo): %s\n", NomeMinusculo);
        System.out.printf("Número de letras total: %d\n", NumLetras);
        System.out.printf("Número de letras total: %d", NumLetrasPrimeiro);

    }
}
