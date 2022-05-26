import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 ** created by: jorge.lessa
 */
class VendaTest {

    @Test
    void deveRetornarCompraNoDinheiro()
    {
        Dinheiro dinheiro = new Dinheiro();
        Venda venda = new Venda(100);
        venda.setFormaPagamento(dinheiro);
        assertEquals(95, venda.calcularValor(), 0.01);
    }

    @Test
    void deveRetornarCompraNoDebito()
    {
        Debito debito = new Debito();
        Venda venda = new Venda(100);
        venda.setFormaPagamento(debito);
        assertEquals(100, venda.calcularValor(), 0.01);
    }

    @Test
    void deveRetornarCompraNoCredito()
    {
        Credito credito = new Credito();
        Venda venda = new Venda(100);
        venda.setFormaPagamento(credito);
        assertEquals(110, venda.calcularValor(), 0.01);
    }

}