package CEV.P1;

import java.util.Scanner;
public class P005 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int N = scanner.nextInt();

        int S = 0;

        if (N <= 0) {
            System.out.print("Valor inválido!");
        }

        else {
            // Define o começo ; Define o limte; define o incremento.

            for (int i = 1; i <= N; i++) {

                S += i;
            }

            System.out.printf("O valor da soma dos números de 1 a %d é de = %d", N, S);
        }
    }
}
