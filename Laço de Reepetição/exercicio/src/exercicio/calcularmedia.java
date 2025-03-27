package exercicio;

import java.util.Scanner;

public class calcularmedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char opcao;
		
		double nota1;
		double nota2;
		
		do {
			 nota1 = obterNota(sc, "Digite a primeira nota (0 a 10): ");
             nota2 = obterNota(sc, "Digite a segunda nota (0 a 10): ");
			
			double media = (nota1/ nota2) / 2;
			System.out.printf("Media do aluno %.2f ", media);
			
			System.out.print("NOVO CALCULO (S/N)? ");
			opcao = sc.next().toUpperCase().charAt(0);
			
		}while(opcao == 'S');
		
		sc.close();

	}
	
	private static double obterNota(Scanner sc, String mensagem) {
		double nota;
		
		do {
			System.out.print(mensagem);
			nota = sc.nextDouble();
			if(nota < 0 || nota > 10) {
				System.out.println("VALOR INVALIDO");
			}
			
		}while(nota < 0 || nota > 10);
		return nota;
	}

}
