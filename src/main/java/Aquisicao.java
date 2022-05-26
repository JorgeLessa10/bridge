/*
 ** created by: jorge.lessa
 */
public class Aquisicao extends Pagamento {

    public Aquisicao(double valor) {
        super(valor);
    }

    // O valor dos itens adquiridos pela loja, não entra na politica de desconto ou acrescimo.
    @Override
    public double calcularValor() {
        return this.getValor();
    }
}
