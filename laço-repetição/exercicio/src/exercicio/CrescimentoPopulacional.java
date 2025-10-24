package exercicio;

public class CrescimentoPopulacional {

	public static void main(String[] args) {
		int populA= 80000;
		int populB= 200000;
		double taxaA = 0.03;
		double taxaB = 0.015;
		int anos = 0;
		
		while (populA < populB) {
			populA += populA * taxaA;
			populB += populB * taxaB;
		}
		
		System.out.println("Numero de anos necessarios: " + anos);
	}

}
