import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        int x = scanner.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        int y = scanner.nextInt();
        
        int z = y; 
        int a = x;

        System.out.println("\n");
        System.out.println("O primeiro numero agora é: " + z);
        System.out.println("O segundo numero agora é: " + a);
        
        scanner.close();
    }
}
