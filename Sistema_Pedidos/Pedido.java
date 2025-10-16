package Sistema_Pedidos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDate data;
    private StatusPedido statusPedido;
    private List<ItemPedido> itens;
    private Cliente cliente;
    private IPagamento metodoPagamento;

    public Pedido(LocalDate data, Cliente cliente) {
        this.data = data;
        this.itens = new ArrayList<>();
        this.cliente = cliente;
    }

    void exibirDetalhes() {
        System.out.println("Data de entrega: " + this.data);
        System.out.println("Status do pedido: " + this.statusPedido);
        System.out.println("Método de pagamento: " + this.metodoPagamento);
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return this.itens;
    }

    public IPagamento getPagamento() {
        return this.metodoPagamento;
    }

    public void setPagamento(IPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }


    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getSubTotal();
        }
        return total;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        for(ItemPedido item: itens) {
            if (item.getProduto().equals(produto)) {
                item.adicionarQuantidade(quantidade);
                return;
            }
        }
        
        itens.add(new ItemPedido(produto, quantidade));
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public double aplicarDesconto(double desconto) {
        double total = calcularTotal();
        return total * desconto;

    }

    public boolean confirmarPedido() {
        if (this.statusPedido != StatusPedido.PENDENTE) {
            return false;
        }
        if (this.metodoPagamento == null) {
            return false;
        }

        boolean sucesso = metodoPagamento.processarPagamento(this.calcularTotal());

        if (sucesso) {
            this.statusPedido = StatusPedido.PROCESSANDO;
        }
        else {
            this.statusPedido = StatusPedido.PENDENTE;
        }

        return sucesso;
    }
}
