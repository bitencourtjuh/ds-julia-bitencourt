import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distancia percorrida (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o consumo do carro(l): ");
        double consumo = scanner.nextDouble();

        System.out.print("Digite o preço do litro (R$/l): ");
        double preço = scanner.nextDouble();

        double total = (distancia * consumo) / preço ;

        System.out.println("\n");
        System.out.println("Custo estimado com combustível: " + total);

        scanner.close();
    }
}
