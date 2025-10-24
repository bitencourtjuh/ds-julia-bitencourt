package application;

public class Celular {

    String modelo;
    String marca;
    int ano;
    boolean ligado;

    void ligar() {
        ligado = true;
        System.out.println("Celular ligado.");
    }

    void desligar() {
        ligado = false;
        System.out.println("Celular desligado.");
    }

    void fazerLigacao(String numero) {
        if (ligado) {
            System.out.println("Ligando para " + numero + "...");
        } else {
            System.out.println("O celular está desligado. Impossível fazer ligação.");
        }
    }

    void tocarAlarme() {
        if (ligado) {
            System.out.println("⏰ Alarme tocando!");
        } else {
            System.out.println("O celular está desligado. Nenhum som emitido.");
        }
    }
}
