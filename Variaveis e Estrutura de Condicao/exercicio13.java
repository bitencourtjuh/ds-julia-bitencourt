import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade de anos: ");
        int ano = scanner.nextInt();

        System.out.print("Digite sua idade de meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite sua idade de dias : ");
        int dias = scanner.nextInt();

        int total = (ano * 365) + (meses * 30) + dias ;

        System.out.println("\n");
        System.out.println(" A idade essa pessoa é: " + total);

        scanner.close();

    }
}
