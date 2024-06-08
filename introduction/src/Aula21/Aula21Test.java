package Aula21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Aula21Test {

    @Test
    public void testaConta1(){
        ContaBancaria conta = new ContaBancaria();
        double saldo = conta.getSaldo();
        assertEquals(0.0,saldo, 0.0);

    }

    @Test
    public void testaConta2(){
        ContaBancaria conta = new ContaBancaria();
        boolean retorno = conta.depositar(50.0);
        double saldo = conta.getSaldo();
        assertEquals(true,retorno);
        assertEquals(50.0,saldo, 0.0);

    }

}