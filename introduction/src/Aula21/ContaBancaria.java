package Aula21;

public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        saldo += valor;
        return true;
    }
}
