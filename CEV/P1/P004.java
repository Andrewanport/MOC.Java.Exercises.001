package CEV.P1;

import java.util.Scanner;
public class P004 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número (1): ");
        double N1 = scanner.nextDouble();

        System.out.print("Digite um número (2): ");
        double N2 = scanner.nextDouble();

        System.out.println("Digite a opção que deseja: ");
        System.out.println("[1] - Subtração");
        System.out.println("[2] - Divisão");
        System.out.println("[3] - Multiplicação");
        System.out.println("[4] - Average");

        Double R;

        int O = scanner.nextInt();

        switch (O){
            case 1:
                if (N1 > N2) {
                    System.out.printf("A subtração de %.2f e %.2f é = %.2f ", N1, N2, (N1 - N2) );
                }

                else if (N1 < N2) {
                    System.out.printf("A subtração de %.2f e %.2f é = %.2f ", N2, N1, (N2 - N1) );
                }

                else if (N1 == N2) { // could be just "else", i used "else if" just to be more clear about it
                    System.out.printf("A subtração de %.2f e %.2f é = %.2f ", N1, N2, (N1 - N2) );
                }
                break;

            case 2:
                if (N1 == 0){
                    System.out.printf("%.2f dividido por %.2f = %.2f", N1, N2, N1);
                }

               else if (N2 == 0){
                    System.out.printf("%.2f dividido por %.2f = [Indefinido]", N1, N2);
                }
               else {
                    System.out.printf("%.2f dividido por %.2f = %.2f", N1, N2, (N1 / N2) );
                }
                break;

            case 3:
                System.out.printf("%.2f x %.2f = %.2f", N1, N2, (N1 * N2) );
                break;

            case 4:
                System.out.printf("A média entre %.2f & %.2f = %.2f", N1, N2, ( (N1 + N2) / 2 ) );
                break;

        }
    }
}
