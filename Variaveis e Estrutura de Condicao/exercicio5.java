import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retangulo: ");
        int base = scanner.nextInt();

        System.out.print("Digite a altura do retanguo: ");
        int altura = scanner.nextInt();

        int area = altura * base ;

        System.out.println("Area do retangulo é:" + area);


        scanner.close();
    };
};
