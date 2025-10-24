package application;

public class ContaBancaria {
    private String cliente;
    private int numConta;
    private float saldo;

    public ContaBancaria(String cliente, int numConta, float saldoInicial) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldoInicial;
    }

    public boolean sacar(float valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true; 
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
            return false; 
        }
    }

    // Método para depositar
    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }

    public String getCliente() {
        return cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void exibirDados() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Número da conta: " + numConta);
        System.out.println("Saldo: R$ " + saldo);
    }
}

