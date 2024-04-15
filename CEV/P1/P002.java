/*
        ----------------------------------- Exercise 3 -----------------------------------------------------------------

        Read 2 String type values and convert to double precision floating point values A and B, which correspond to 2 grades of a student.
        Next, calculate the student's average. Assume that each grade can range from 0 to 10.0, always with one decimal place.InputThe input file contains 2 values of type String.
        OutputPrint the message "MEDIA" and the student's average, with 2 digits after the decimal point and with a blank space before and after the equality.
        Use double precision variables.

        ----------------------------------------------------------------------------------------------------------------
*/

package CEV.P1;

import java.util.Scanner;

public class P002 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota (1): ");
        String N1 = scanner.next();

        System.out.print("Digite sua nota (2): ");
        String N2 = scanner.next();

        double N1D = Double.parseDouble(N1);
        double N2D = Double.parseDouble(N2);

        double A = (N1D + N2D) / 2;

        System.out.printf("Média do aluno: %.2f", A);

        scanner.close();

    }
}
