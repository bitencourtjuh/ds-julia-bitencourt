import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distancia percorrida (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o consumo do carro(l): ");
        double consumo = scanner.nextDouble();

        System.out.print("Digite o preço da gasolina (R$): ");
        double preço = scanner.nextDouble();

        double total = (distancia * consumo) / preço ;

        System.out.println("\n");
        System.out.println("O custo estimado gasto na viagem é: " + total);

        scanner.close();
    }
}
