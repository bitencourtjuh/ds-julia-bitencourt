import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = scanner.nextInt();

        int total = num - 1;

        System.out.println("\n");
        System.out.println("O numero antecessor ao digitado é: " + total);
       
        scanner.close();

    }
}

