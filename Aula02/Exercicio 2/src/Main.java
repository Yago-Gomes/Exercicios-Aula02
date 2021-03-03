import java.util.Scanner;

/**
 * @author Yago
 * @version 1.0
 * @since 03/03/21 - 02:28 AM
 * @category View
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Circunferencia circunferencia = new Circunferencia();
        System.out.println("Digite o raio da circunferencia:");
        circunferencia.setRaio(scanner.nextDouble());

        System.out.println(circunferencia);
    }
}
