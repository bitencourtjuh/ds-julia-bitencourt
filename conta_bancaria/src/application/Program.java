package application;

public class Program {
	public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Maria", 12345, 500);

        conta.exibirDados();

        conta.depositar(200);
        conta.sacar(100);

        conta.exibirDados();
    }

}
