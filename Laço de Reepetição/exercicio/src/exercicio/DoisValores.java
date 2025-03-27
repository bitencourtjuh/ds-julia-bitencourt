package exercicio;

import java.util.Scanner;

public class DoisValores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1;
		int valor2;
		
		while(true) {
			System.out.println("Digite o primeiro valor: ");
	        valor1 = sc.nextInt();
			
			System.out.println("Digite o segundo valor: ");
		    valor2 = sc.nextInt();
			
			if(valor1 == 0) {
				System.out.println("Digite um novo valor!\n");
			}else if(valor2 == 0) {
				System.out.println("Digite um novo valor!\n");
			}else {
				break;
			}
		}
		
		int divisao = valor1/valor2;
		System.out.println("O Resultado da divisão é: " + divisao);
		 sc.close();
	}
     
}
