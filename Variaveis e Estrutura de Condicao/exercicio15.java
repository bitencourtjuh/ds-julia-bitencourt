import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total de eleitores do município: ");
        int eleitores = scanner.nextInt();

        System.out.print("Digite a quantidae de votos brancos: ");
        double brancos = scanner.nextDouble();

        System.out.print("Digite a quantidade de votos nulos : ");
        double nulos = scanner.nextDouble();

        System.out.print("Digite a quantidade de votos validos : ");
        double validos = scanner.nextDouble();

        double percentualNulo = nulos / eleitores * 100; 
        double percentualBrancos = brancos / eleitores * 100; 
        double percentualValidos = validos / eleitores * 100; 

        System.out.println("\n");
        System.out.println("Percentual de Votos Brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de Votos Nulos: " + percentualNulo + "%");
        System.out.println("Percentual de Votos Validos: " + percentualValidos + "%");

        scanner.close();
    }
}
