import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite o seu genero. M - Masculino, F - Feminino: ");
        String genero = scanner.nextLine();

        if(genero == "M"){
            double ideal = (72.7 * altura) - 58;

            System.out.println(nome +", seu peso ideal é: " + ideal +"Kg");
        } else if( genero == "F"){
            double ideal = (62.1 * altura) - 44.7;

            System.out.println(nome +",  seu peso ideal é: " + ideal +"Kg");
        } else{
            System.out.println("Sinto muito, ocorreu um erro \n Tente novamente!");
        }

        scanner.close();
    }
}
