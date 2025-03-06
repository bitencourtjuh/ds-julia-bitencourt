import java.util.Scanner;

public class exercicio19{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int Vendidos = scanner.nextInt();
        
        System.out.print("Digite o valor total das vendas: R$ ");
        double valor = scanner.nextDouble();
        
        System.out.print("Digite o salário fixo do vendedor: R$ ");
        double salario = scanner.nextDouble();
        
        System.out.print("Digite o valor da comissão por carro vendido: R$ ");
        double comissao = scanner.nextDouble();

        double comissaoVendas = Vendidos * comissao;

        double comissaoPercentual = valor * 0.05;

        double Final = salario + comissaoVendas + comissaoPercentual;

        System.out.printf("O salário final do vendedor é: R$", Final);

        scanner.close();
    }
}

