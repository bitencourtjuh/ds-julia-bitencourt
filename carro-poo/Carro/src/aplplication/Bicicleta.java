package aplplication;

public class Bicicleta {
    private int velocidade;

    public Bicicleta() {
        this.velocidade = 0;
    }

    public void pedalar(int valor) {
        velocidade += valor;
        System.out.println("Pedalando... Velocidade: " + velocidade + " km/h");
    }

    public void frear(int valor) {
        velocidade -= valor;
        if (velocidade < 0) velocidade = 0;
        System.out.println("Freando... Velocidade: " + velocidade + " km/h");
    }

    public void status() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
}
