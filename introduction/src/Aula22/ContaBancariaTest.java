package Aula22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {
//
//    @Test
//    void getSaldo() {
//    }
//
//    @Test
//    void depositar() {
//    }

    @Test
    public void testaConta1(){
        ContaBancaria conta = new ContaBancaria(20.0);
        boolean retorno = conta.sacar(10);
        assertEquals(true, retorno);
        assertEquals(10.0, conta.getSaldo(), 0.0);
    }

}