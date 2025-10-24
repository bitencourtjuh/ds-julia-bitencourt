package Exercicios;

import java.util.Scanner;

public class Salario_Minimo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salarioMinimo, salarioUser, resultado;
		
		salarioMinimo = 788.00;
		
		System.out.println("Digite o valor do seu salario abaixo: ");
		salarioUser = sc.nextDouble();
		
		resultado = salarioUser / salarioMinimo;
		
		System.out.println("Você ganha " + resultado + " salários mínimos");
		
	}

}
