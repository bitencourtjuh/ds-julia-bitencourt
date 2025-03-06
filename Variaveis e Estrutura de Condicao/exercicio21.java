import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double precoAlcool = 2.90;
        double precoGasolina = 3.30;

        System.out.print("Digite o tipo de combustível (A para Álcool ou G para Gasolina): ");
        char tipoCombustivel = scanner.next().charAt(0);
        
        System.out.print("Digite a quantidade de litros vendidos: ");
        double litrosVendidos = scanner.nextDouble();

        double valorTotal = 0.0;
        
        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {

            if (litrosVendidos <= 20) {
                valorTotal = litrosVendidos * precoAlcool * (1 - 0.03); 
            } else {
                valorTotal = litrosVendidos * precoAlcool * (1 - 0.05); 
            }
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
        
            if (litrosVendidos <= 20) {
                valorTotal = litrosVendidos * precoGasolina * (1 - 0.04); 
            } else {
                valorTotal = litrosVendidos * precoGasolina * (1 - 0.06); 
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            scanner.close();
            return;
        }

        System.out.printf("O valor a ser pago é: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
