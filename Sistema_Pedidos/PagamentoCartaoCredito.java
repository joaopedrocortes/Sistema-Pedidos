package Sistema_Pedidos;

public class PagamentoCartaoCredito implements IPagamento {
    private String numeroCartao;

    public boolean processarPagamento(double valor) {
        if (valor < 200) {
            return true;
        }
        else
        return false;
    }

    public String getNumeroCartao() {
        return this.numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}
