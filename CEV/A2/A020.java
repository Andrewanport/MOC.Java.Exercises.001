/** Exercício Java 020:
 O mesmo professor do desafio 019 quer sortear a ordem de apresentação de trabalhos dos alunos.
 Faça um programa que leia o nome dos quatro alunos e mostre a ordem sorteada.
 */

package CEV.A2;

import java.util.Scanner;
import java.util.Random;

public class A020 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno 1: ");
        String aluno1 = entrada.nextLine();

        System.out.print("Digite o nome do aluno 2: ");
        String aluno2 = entrada.nextLine();

        System.out.print("Digite o nome do aluno 3: ");
        String aluno3 = entrada.nextLine();

        System.out.print("Digite o nome do aluno 4: ");
        String aluno4 = entrada.nextLine();

        // Cria um array com os nomes dos alunos
        String[] alunos = {aluno1, aluno2, aluno3, aluno4};

        // Embaralha a ordem dos alunos
        embaralharOrdem(alunos);

        // Imprime a ordem de apresentação dos alunos
        System.out.println("Ordem de apresentação dos trabalhos:");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println((i + 1) + ". " + alunos[i]);
        }
    }

    // Método para embaralhar a ordem dos alunos
    public static void embaralharOrdem(String[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            String temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}

