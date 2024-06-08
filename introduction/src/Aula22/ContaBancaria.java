package Aula22;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor < 0)
            return false;
        saldo -= valor;
        return true;
    }

}
