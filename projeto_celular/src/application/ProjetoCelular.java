package application;

public class ProjetoCelular {
    public static void main(String[] args) {
        Celular c1 = new Celular();
        c1.modelo = "Iphone 13";
        c1.marca = "Apple";
        c1.ano = 2021;

        c1.ligar();
        c1.fazerLigacao("1199999-8888");
        c1.tocarAlarme();

        c1.desligar();
        c1.fazerLigacao("1199999-8888");
    }
}
