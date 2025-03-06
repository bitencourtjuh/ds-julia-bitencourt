import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distancia percorrida (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Escolha o tipo de combustível (1 - Gasolina, 2 - Álcool): ");
        int tipoCombustivel = scanner.nextInt();

        System.out.print("Digite o preço da gasolina (R$): ");
        double preço = scanner.nextDouble() ;

        double consumo = 0.0 ;

        if( tipoCombustivel == 1) {
            System.out.print("Informe o consumo do carro com gasolina (em km/l): ");
            consumo = scanner.nextDouble();
        }else if(tipoCombustivel == 2) {
            System.out.print("Informe o consumo do carro com alcool (em km/l): ");
            consumo = scanner.nextDouble();
        }else{
            System.out.println("Tipo de combustível inválido.");
        }

        double Quantidade = distancia / consumo ;

        double total = Quantidade * preço ;

        System.out.println("\n");
        System.out.println("Custo estimado com combustível para a viagem (R$) é:  " + total);

        scanner.close();
    }
}
