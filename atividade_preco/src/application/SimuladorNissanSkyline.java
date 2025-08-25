package application;

public class SimuladorNissanSkyline {
	public static void main(String[] args) {
        Carro skyline = new Carro();

        skyline.setNomeModelo("Nissan Skyline GT-R R34");

        skyline.setPrecos(180000.0, 220000.0, 350000.0); 

        System.out.println("=== SIMULAÇÃO: VALORIZAÇÃO DO SKYLINE ===");
        skyline.Informacao();

        System.out.println("\n--- Preços por Ano ---");
        System.out.println("Ano 1: R$" + skyline.precoAno1);
        System.out.println("Ano 2: R$" + skyline.precoAno2);
        System.out.println("Ano 3: R$" + skyline.precoAno3);

        // Média dos preços
        double media = (skyline.precoAno1 + skyline.precoAno2 + skyline.precoAno3) / 3;
        System.out.println("\nMédia dos preços: R$" + media);

        // Análise de valorização
        System.out.println("\n--- Análise de Valorização ---");
        if (skyline.precoAno3 > skyline.precoAno1) {
            double variacao = ((skyline.precoAno3 - skyline.precoAno1) / skyline.precoAno1) * 100;
            System.out.printf("O Skyline valorizou %.2f%% do Ano 1 para o Ano 3.%n", variacao);
        } else {
            System.out.println("O Skyline não valorizou entre os anos analisados.");
        }
    }

}
