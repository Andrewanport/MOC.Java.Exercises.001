/** Exercício Python 004: Faça um programa que leia algo pelo teclado e mostre na tela o seu tipo primitivo e todas as informações possíveis sobre ele. */

package CEV.A1;


import java.util.Scanner;

public class A004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtendo a entrada do usuário
        System.out.print("Digite qualquer coisa: ");
        String input = scanner.nextLine();

        // Verificando se é numérico
        System.out.println("Isso é numérico?");
        System.out.println(isNumeric(input));

        // Verificando se é alfabético
        System.out.println("Isso é alfabético?");
        System.out.println(isAlphabetic(input));

        // Verificando se é ASCII
        System.out.println("Isso é ASCII?");
        System.out.println(isAscii(input));

        // Verificando se é um dígito
        System.out.println("Isso é um dígito?");
        System.out.println(isDigit(input));
    }

    // Método para verificar se a string é numérica
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    // Método para verificar se a string é alfabética
    public static boolean isAlphabetic(String str) {
        return str.chars().allMatch(Character::isLetter);
    }

    // Método para verificar se a string é ASCII
    public static boolean isAscii(String str) {
        return str.chars().allMatch(c -> c >= 0 && c <= 127);
    }

    // Método para verificar se a string é um dígito
    public static boolean isDigit(String str) {
        return str.chars().allMatch(Character::isDigit);
    }
}

