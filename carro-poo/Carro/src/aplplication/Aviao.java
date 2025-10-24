package aplplication;


public class Aviao {
    private boolean ligado;
    private int altitude;

    public Aviao() {
        this.ligado = false;
        this.altitude = 0;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Avião ligado.");
    }

    public void desligar() {
        if (altitude == 0) {
            ligado = false;
            System.out.println("Avião desligado.");
        } else {
            System.out.println("Aterre antes de desligar!");
        }
    }

    public void decolar(int metros) {
        if (ligado) {
            altitude += metros;
            System.out.println("Decolando... Altitude: " + altitude + " metros");
        } else {
            System.out.println("Ligue o avião primeiro!");
        }
    }

    public void pousar(int metros) {
        altitude -= metros;
        if (altitude < 0) altitude = 0;
        System.out.println("Descendo... Altitude: " + altitude + " metros");
    }

    public void status() {
        System.out.println("Avião ligado: " + ligado + ", Altitude: " + altitude + " metros");
    }
}
