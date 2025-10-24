package Exercicios;

import java.util.Scanner;

public class Antecessor_Sucessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num,ant, suc;
		
		System.out.println("Digite um numero inteiro: ");
		num = sc.nextInt();
		
		ant = num - 1;
		suc = num + 1;
		
		System.out.println("Antecessor: " +ant  );
		System.out.println("Sucessor: "+suc );

	}

}
