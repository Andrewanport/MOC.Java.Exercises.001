package CEV.P1;

import java.util.Scanner;
public class P006 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int I = scanner.nextInt();

        if (I < 16) {
            System.out.print("Ainda não tem idade para votar!");
        }
        else if (I < 18){
            System.out.print("Voto não obrigatório!");
        }
        else if (I <= 65){
            System.out.print("Voto obrigatório!");
        }
        else {
            System.out.print("Voto não obrigatório!");
        }

    }
}
