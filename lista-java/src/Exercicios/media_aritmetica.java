package Exercicios;

import java.util.Scanner;

public class media_aritmetica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double primeiraMedia, segundaMedia, soma, resultado;
	    
		primeiraMedia = (8 + 9 + 7) / 3;
		segundaMedia = (4 + 5 + 6) / 3;
		soma = primeiraMedia + segundaMedia;
		resultado = soma / 2;
		
		System.out.println("A primeira média: " +primeiraMedia);
		System.out.println("A Segunda média: " +segundaMedia);
		System.out.println("A Somas das duas médias: " +soma);
		System.out.println("A médias das médias: " + resultado);
	    

	}

}
