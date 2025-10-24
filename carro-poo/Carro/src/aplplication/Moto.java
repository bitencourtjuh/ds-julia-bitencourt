package aplplication;

public class Moto {
 private boolean ligado;
 private int velocidade;
}

public Moto() {
	this.ligado = false;
	this.velocidade = 0;
}


public void ligar() {
    ligado = true;
    System.out.println("Moto ligada.");
}

public void desligar() {
    if (velocidade == 0) {
        ligado = false;
        System.out.println("Moto desligada.");
    } else {
        System.out.println("Pare a moto antes de desligar!");
    }
}

public void acelerar(int valor) {
    if (ligado) {
        velocidade += valor;
        System.out.println("Acelerando... Velocidade: " + velocidade + " km/h");
    } else {
        System.out.println("Ligue a moto primeiro!");
    }
}

public void frear(int valor) {
    velocidade -= valor;
    if (velocidade < 0) velocidade = 0;
    System.out.println("Freando... Velocidade: " + velocidade + " km/h");
}

public void status() {
    System.out.println("Moto ligada: " + ligado + ", Velocidade: " + velocidade + " km/h");
}
}