package application;

public class Carro {
	
    private String nomeModelo;
    protected double precoAno1;
    protected double precoAno2;
    protected double precoAno3;

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void setPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public double MenorPreco() {
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        }
        if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    public double MaiorPreco() {
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        }
        if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }

    public void Informacao() {
        System.out.println("Nome do carro: " + nomeModelo);
        System.out.println("Menor preço: R$" + MenorPreco());
        System.out.println("Maior preço: R$" + MaiorPreco());
    }
}

