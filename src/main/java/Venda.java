/*
 ** created by: jorge.lessa
 */

public class Venda extends Pagamento {

    public Venda(double valor) {
        super(valor);
    }

    @Override
    public double calcularValor() {
        return this.valor * this.formaPagamento.calcularMetodoPagamento();
    }
}
