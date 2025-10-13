package Sistema_Pedidos;

import java.time.LocalDate;

public class PagamentoBoleto implements IPagamento {
    private String codigoBarras;
    private LocalDate dataVencimento;
    private double valor;
    private StatusPagamento statusPagamento;

    public boolean processarPagamento(double valor) {
        this.statusPagamento = StatusPagamento.APROVADO;
        return true;
        
    }

    public String getCodigoBarras() {
        return this.codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public LocalDate getDataVencimento() {
        return this.dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public StatusPagamento getStatus() {
        return this.statusPagamento;
    }
}
