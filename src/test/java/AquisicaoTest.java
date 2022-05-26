import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 ** created by: jorge.lessa
 */
class AquisicaoTest {

    @Test
    void deveRetornarAquisicaoNoDinheiro()
    {
        Dinheiro dinheiro = new Dinheiro();
        Aquisicao aquisicao = new Aquisicao(50);
        aquisicao.setFormaPagamento(dinheiro);
        assertEquals(50, aquisicao.calcularValor(), 0.01);
    }

    @Test
    void deveRetornarAquisicaoNoDebito()
    {
        Debito debito = new Debito();
        Aquisicao aquisicao = new Aquisicao(50);
        aquisicao.setFormaPagamento(debito);
        assertEquals(50, aquisicao.calcularValor(), 0.01);
    }

    @Test
    void deveRetornarAquisicaoNoCredito()
    {
        Credito credito = new Credito();
        Aquisicao aquisicao = new Aquisicao(50);
        aquisicao.setFormaPagamento(credito);
        assertEquals(50, aquisicao.calcularValor(), 0.01);
    }
}