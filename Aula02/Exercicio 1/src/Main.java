import java.util.Scanner;

/**
 * @author Yago
 * @version 1.0
 * @since 03/03/21 - 12:18 AM
 * @category View
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno:");
        aluno.setName(scanner.nextLine());

        System.out.println("Digite a N1 do aluno:");
        aluno.setN1(scanner.nextDouble());

        System.out.println("Digite a N2 do aluno:");
        aluno.setN2(scanner.nextDouble());

        System.out.println("Digite a N3 do aluno:");
        aluno.setN3(scanner.nextDouble());

        System.out.println(aluno);

    }
}
