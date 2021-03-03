import java.util.Scanner;

/**
 * @author Yago
 * @version 1.0
 * @since 03/03/21 - 02:35 AM
 * @category View
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Variavel variavel = new Variavel();
        System.out.println("Digite um numero real:");
        variavel.setNumero(scanner.nextDouble());

        System.out.println(variavel);
    }
}
