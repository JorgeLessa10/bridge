/*
 ** created by: jorge.lessa
 */
public class Credito implements IFormaPagamento{

    @Override
    public double calcularMetodoPagamento() {
        return 1.1;
    }
}
