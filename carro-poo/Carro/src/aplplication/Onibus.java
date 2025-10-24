package aplplication;


public class Onibus {
    private boolean ligado;
    private int velocidade;

    public Onibus() {
        this.ligado = false;
        this.velocidade = 0;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Ônibus ligado.");
    }

    public void desligar() {
        if (velocidade == 0) {
            ligado = false;
            System.out.println("Ônibus desligado.");
        } else {
            System.out.println("Pare o ônibus antes de desligar!");
        }
    }

    public void acelerar(int valor) {
        if (ligado) {
            velocidade += valor;
            System.out.println("Acelerando... Velocidade: " + velocidade + " km/h");
        } else {
            System.out.println("Ligue o ônibus primeiro!");
        }
    }

    public void frear(int valor) {
        velocidade -= valor;
        if (velocidade < 0) velocidade = 0;
        System.out.println("Freando... Velocidade: " + velocidade + " km/h");
    }

    public void status() {
        System.out.println("Ônibus ligado: " + ligado + ", Velocidade: " + velocidade + " km/h");
    }
}
