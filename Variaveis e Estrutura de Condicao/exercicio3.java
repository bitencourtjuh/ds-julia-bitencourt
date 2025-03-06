import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu salario fixo: ");
        Double fixo = scanner.nextDouble();

        System.out.print("Digite o total de vendas no mes: ");
        Double vendas = scanner.nextDouble();

        double comissao = vendas * 0.15 ;

        double salarioFinal = fixo + comissao ;

        System.out.println("\n Relatorio do vendedor");
        System.out.println("Nome do vendedor: " + nome);
        System.out.println("O salario fixo do mês: "+ fixo);
        System.out.println("O salario final do mês: "+ salarioFinal);

        scanner.close();
    }
}
