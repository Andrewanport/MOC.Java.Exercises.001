/*
        ----------------------------------- Exercise 2 -----------------------------------

        Read 2 Strings and store them in variables A and B. Convert the values A and B to Integer.
        Add the integer values assigning your result to the variable X.
        Print X as per the example shown below.
        Do not present any message beyond what is being specified.Input The input contains 2 values type String.
        OutputPrint the message "X = " (capital letter X) followed by the value of the variable X and the end of the line.

        ----------------------------------------------------------------------------------
*/

package CEV.P1;

import java.util.Scanner;
public class P001 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro (1): ");
        String A = scanner.nextLine();

        System.out.print("Digite um valor inteiro (2): ");
        String B = scanner.nextLine();

        int IA = Integer.parseInt(A);
        int IB = Integer.parseInt(B);

        int S = IA + IB;

        System.out.printf("X = %d", S);
    }
}
