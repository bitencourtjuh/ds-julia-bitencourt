import  java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distancia total percorrida : ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o total de combustível gasto: ");
        double combustivel = scanner.nextDouble();

        double media = distancia / combustivel  ;

        System.out.println("o consumo medio de automovel é : " + media + " km/l");


        scanner.close();
    };
}; 