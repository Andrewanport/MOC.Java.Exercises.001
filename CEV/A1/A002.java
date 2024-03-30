/** Exercício Java 002: Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas. */

package CEV.A1;

import java.util.Scanner;

public class A002 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.printf("Olá, %s! Seja bem-vindo(a)",nome);
    }
}
