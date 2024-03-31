/** Exercício Java 013:
 * Faça um algoritmo que leia o salário de um funcionário e mostre seu novo salário, com 15% de aumento.
 * */

package CEV.A2;

import java.util.Scanner;
public class A013 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: ");

        float Salario = entrada.nextFloat();

        float SalarioAumentado = Salario + (Salario * 15 / 100);

        float Aumento = SalarioAumentado - Salario;

        System.out.printf("Salário original: %.2f\n", Salario);

        System.out.printf("Salário atual: %.2f\n", SalarioAumentado);

        System.out.printf("Valor do aumento: %.2f",Aumento );
    }
}
