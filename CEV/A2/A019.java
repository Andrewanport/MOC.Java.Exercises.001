/** Exercício Java 019:
 Um professor quer sortear um dos seus quatro alunos para apagar o quadro.
 Faça um programa que ajude ele, lendo o nome dos alunos e escrevendo na tela o nome do escolhido.
 */

package CEV.A2;

import java.util.Random;
import java.util.Scanner;

public class A019 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome de um aluno (1): ");
        String A1 = entrada.nextLine();

        System.out.print("Digite o nome de um aluno (2): ");
        String A2 = entrada.nextLine();

        System.out.print("Digite o nome de um aluno (3): ");
        String A3 = entrada.nextLine();

        System.out.print("Digite o nome de um aluno (4): ");
        String A4 = entrada.nextLine();

        String[] L = {A1,A2,A3,A4};

        Random random = new Random();

        int Indice = random.nextInt(L.length);

        String Aluno = L[Indice];

        System.out.printf("O aluno sorteado foi: %s", Aluno);
    }
}
