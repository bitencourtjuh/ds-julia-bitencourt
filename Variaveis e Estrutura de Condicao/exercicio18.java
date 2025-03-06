import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custo = scanner.nextDouble();

        double distribuidora = 28.0 / 100;
        double impostos = 28.0 / 100;

        double custoImpostos = custo * impostos;
        double custoDistribuidora = custo * distribuidora;

        double Final = custo + custoDistribuidora + custoImpostos ;

        
        System.out.println("\n ");
        System.out.println("O custo final ao consumidor será " + Final);

        scanner.close();
    }
}