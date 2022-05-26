/*
 ** created by: jorge.lessa
 */

public abstract class Pagamento {

    protected double valor;
    protected IFormaPagamento formaPagamento;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public IFormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(IFormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public abstract double calcularValor();

}
