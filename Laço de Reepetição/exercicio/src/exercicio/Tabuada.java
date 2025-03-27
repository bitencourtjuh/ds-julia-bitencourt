package exercicio;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("Digite um valor entre 1 e 10: ");
			n = sc.nextInt();
			if(n < 1 || n > 10) {
				System.out.println("VALOR INVALIDO. Digite um numero entre 1 e 10.");
			}
		}while(n < 1 || n > 10);
		
		System.out.println("Tabuada do " + n + ":" );
		for(int i = 1 ; i <= 10; i++) {
			System.out.println(n + "x " + i + " = " + (n * i));
		}
       sc.close();
	}

}
