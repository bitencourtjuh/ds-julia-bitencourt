package ex001poo;

public class Carro {
    private boolean ligado;
    private int velocidade;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Carro ligado.");
    }

    public void desligar() {
        if (velocidade == 0) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("Deve parar o carro antes de desligar!");
        }
    }

    public void acelerar(int valor) {
        if (ligado) {
            velocidade += valor;
            System.out.println("Acelerando... Velocidade: " + velocidade + " km/h");
        } else {
            System.out.println("Ligue o carro primeiro!");
        }
    }

    public void frear(int valor) {
        velocidade -= valor;
        if (velocidade < 0) velocidade = 0;
        System.out.println("Freando... Velocidade: " + velocidade + " km/h");
    }

    public void status() {
        System.out.println("Carro ligado: " + ligado + ", Velocidade: " + velocidade + " km/h");
    }
}
}
 


