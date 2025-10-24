package Exercicios;

import java.util.Scanner;

public class porcentagem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ipi, cod1, cod2, quant1, quant2;
		double valor1, valor2, resultado;
		
		System.out.println("Digite a porcentagem do IPI: ");
		ipi = sc.nextInt();
		
		
		System.out.println("Digite o codigo da primeira peça: ");
		cod1 = sc.nextInt();
		System.out.println("Digite o valor unitário da primeira peça: ");
		valor1 = sc.nextDouble();
		System.out.println("Digite a quantidade da primeira peça: ");
		quant1 = sc.nextInt();
		
		System.out.println("Digite o codigo da segunda peça: ");
		cod2 = sc.nextInt();
		System.out.println("Digite o valor unitário da segunda peça: ");
		valor2 = sc.nextDouble();
		System.out.println("Digite a quantidade da segunda peça: ");
		quant2 = sc.nextInt();
		
		resultado = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1) ;
		
		System.out.println("Valor total a pagar: R$ " +resultado);
		

	}

}
