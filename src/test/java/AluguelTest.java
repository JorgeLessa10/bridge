import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 ** created by: jorge.lessa
 */
class AluguelTest {

    @Test
    void deveRetornarLocacaoNoDinheiro()
    {
        Dinheiro dinheiro = new Dinheiro();
        Aluguel aluguel = new Aluguel(3, 5);
        aluguel.setFormaPagamento(dinheiro);
        assertEquals(14.25, aluguel.calcularValor(), 0.01);
    }

    @Test
    void deveRetornarLocacaoNoDebito()
    {
        Debito debito = new Debito();
        Aluguel aluguel = new Aluguel(3, 5);
        aluguel.setFormaPagamento(debito);
        assertEquals(15, aluguel.calcularValor(), 0.01);
    }

    @Test
    void deveRetornarLocacaoNoCredito()
    {
        Credito credito = new Credito();
        Aluguel aluguel = new Aluguel(3, 5);
        aluguel.setFormaPagamento(credito);
        assertEquals(16.5, aluguel.calcularValor(), 0.01);
    }
}