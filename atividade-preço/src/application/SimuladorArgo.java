package application;

public class SimuladorArgo {
	public static void main(String[] args) {
		
        Carro carro = new Carro();

        carro.setNomeModelo("Fiat Argo");
        carro.setPrecos(45000.0, 47000.0, 43000.0);

        System.out.println("=== Informações do Carro ===");
        carro.Informacao();

        System.out.println("\n=== Análise de Preços ===");
        System.out.println("Menor preço registrado: R$" + carro.MenorPreco());
        System.out.println("Maior preço registrado: R$" + carro.MaiorPreco());

        // Calculando média dos preços
        double media = (carro.precoAno1 + carro.precoAno2 + carro.precoAno3) / 3;
        System.out.println("Média dos preços: R$" + media);

        // Comparando  maior que o primeiro
        if (carro.precoAno3 > carro.precoAno1) {
            System.out.println("O preço aumentou do Ano 1 para o Ano 3.");
        } else if (carro.precoAno3 < carro.precoAno1) {
            System.out.println("O preço diminuiu do Ano 1 para o Ano 3.");
        } else {
            System.out.println("O preço se manteve igual do Ano 1 para o Ano 3.");
        }
    }

}
