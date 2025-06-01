package aplplication;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		Carro carro = new Carro();
		Moto moto = new Moto();
		Onibus onibus = new Onibus();
		Submarino submarino = new Submarino(();
		Aviao aviao = new Aviao();
		Bicicleta bicicleta = new Bicicleta();
		
		do {
			System.out.println("\n ====== MENU =======");
			System.out.println("!- Carro");
			System.out.println("2- Moto");
			System.out.println("3- Onibus");
			System.out.println("4- Submarino");
			System.out.println("5- Avião");	
			System.out.println("6- Bicicleta");
		    System.out.println("0- Sair");
			System.out.print("Escolha: ");
			opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				carro.ligar();
				carro.acelerar(20);
				carro.frear(10);
				carro.status();
				break;
				
			case 2: 
				moto.ligar();
				moto.acelerar(20);
				moto.frear(10);
				moto.status();
				break;
			case 3: 
				submarino.ligar();
				submarino.mergulhar(50);
				submarino.emergir(20);
				submarino.status();
				break;
			case 4:
				aviao.ligar();
				aviao.decolar(1000);
				aviao.pousar(500);
				aviao.status();
				break
			case 6:
				bicicleta.pedalar(10);
				bicicleta.frear(5);
				bicicleta.status()
				break;
			case 0;
			System.out.println("Saindo...");
			break;
			default:
				System.out.println("Opção Invalida! Tente novamente.");
				} 
		} while (opcao != 0);
				
				sc.close();
	}

}
