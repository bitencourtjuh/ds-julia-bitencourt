package Exercicios;

import java.util.Scanner;

public class Reajuste_Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double saldo, reajuste;
		
		System.out.println("Informe o valor do seu saldo: ");
		saldo = sc.nextDouble();
		
		reajuste = saldo + 1.01;
		
		System.out.println("O reajuste de 1% do saldo: "  +reajuste);
		

	}

}
