package aplplication;

public class Submarino {
    private boolean ligado;
    private int profundidade;

    public Submarino() {
        this.ligado = false;
        this.profundidade = 0;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Submarino ligado.");
    }

    public void desligar() {
        if (profundidade == 0) {
            ligado = false;
            System.out.println("Submarino desligado.");
        } else {
            System.out.println("Emerja antes de desligar!");
        }
    }

    public void mergulhar(int metros) {
        if (ligado) {
            profundidade += metros;
            System.out.println("Mergulhando... Profundidade: " + profundidade + " metros");
        } else {
            System.out.println("Ligue o submarino primeiro!");
        }
    }

    public void emergir(int metros) {
        profundidade -= metros;
        if (profundidade < 0) profundidade = 0;
        System.out.println("Emergindo... Profundidade: " + profundidade + " metros");
    }

    public void status() {
        System.out.println("Submarino ligado: " + ligado + ", Profundidade: " + profundidade + " metros");
    }
}