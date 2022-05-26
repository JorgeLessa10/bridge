/*
 ** created by: jorge.lessa
 */
public class Aluguel extends Pagamento {

    private int qntdDias;

    public Aluguel(double valor, int qntdDias) {
        super(valor);
        this.qntdDias = qntdDias;
    }

    public int getQntdDias() {
        return qntdDias;
    }

    public void setQntdDias(int qntdDias) {
        this.qntdDias = qntdDias;
    }

    @Override
    public double calcularValor() {
        return (this.valor * this.getQntdDias()) * this.formaPagamento.calcularMetodoPagamento();
    }
}
