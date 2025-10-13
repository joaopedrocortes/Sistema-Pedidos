package Sistema_Pedidos;

import java.time.LocalDate;

public class PagamentoCartaoCredito implements IPagamento {
    private String numeroCartao;
    private String nomeTitular;
    private LocalDate dataValidade;
    StatusPagamento statusPagamento;

    public boolean processarPagamento(double valor) {
        if (valor < 5000) {
            this.statusPagamento = StatusPagamento.APROVADO;
            return true;
        }
        else
        this.statusPagamento = StatusPagamento.RECUSADO;
        return false;
    }

    public String getNumeroCartao() {
        return this.numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public LocalDate getDataValidade() {
        return this.dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public StatusPagamento getStatus() {
        return this.statusPagamento;
    }
}
