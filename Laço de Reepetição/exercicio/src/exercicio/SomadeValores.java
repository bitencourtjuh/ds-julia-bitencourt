package exercicio;

import java.util.Scanner;

public class SomadeValores {

	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de números: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("A quantidade de números deve ser maior que zero.");
            return;
        }
        
        int menor, maior, soma = 0;
        
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        menor = maior = soma = numero;
        
        for (int i = 1; i < n; i++) {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            
            soma += numero;
            
            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);
        
        sc.close();

	}

}
