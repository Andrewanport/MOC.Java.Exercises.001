/*
        ----------------------------------- Exercise 4 -----------------------------------

        Maria needs a program for her digital photo developing store, which works with the following prices
        and gives gifts to customers who develop more than 200 photos with an album

        Up to 30  -> R$ 0.50
        Up to 50  -> R$ 0.30
        Up to 100 -> R$ 0.20
        Over 100  -> R $ 0.10

        ----------------------------------------------------------------------------------
*/

package CEV.P1;

import java.util.Scanner;
import java.util.function.DoubleFunction;

public class P003 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantas fotos deseja revelar: ");
        int F = scanner.nextInt();

        double V = 0;

        if (F <= 30){
            V = (F * 0.50);
            System.out.printf("O valor de %d fotos é de R$%.2f\n", F, V);
        }

        else if (F <= 50){
            V = (F * 0.30);
            System.out.printf("O valor de %d fotos é de R$%.2f\n", F, V);
        }

        else if (F <= 100){
            V = (F * 0.20);
            System.out.printf("O valor de %d fotos é de R$%.2f\n", F, V);
        }

        else {
            V = (F * 0.10);
            System.out.printf("O valor de %d fotos é de R$%.2f\n", F, V);
        }

        if (F > 250){
            System.out.print("BÔNUS! Você ganhou um álbum!");
        }

    }
}
