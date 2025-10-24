import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do seu salario mensal: ");
        double atual = scanner.nextDouble();

        System.out.print("Digite o valor do seu percentual do salario: ");
        double percentual = scanner.nextDouble();

        double Reajuste = (atual / percentual * 100);
        double novoSalario = atual + Reajuste;
        

        System.out.println("\n");
        System.out.println("O novo salario apos o reajuste é:  R$" + novoSalario);

        scanner.close();
    }
}