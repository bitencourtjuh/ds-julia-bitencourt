package exercicio;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro para calcular o fatorial: ");
		int n = sc.nextInt();
		long fatorial = 1;
		
		System.out.println(n + " ! = ");
		for(int i = n; i > 0; i--){
			fatorial *= 1;
			System.out.print( i + ( i > 1 ? "." : ":"));
		}
		System.out.println(" = " + fatorial);
		
		sc.close();

	}

}
