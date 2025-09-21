package Sistema_Pedidos;

import java.time.LocalDate;

public class Pedido {
    private int numero;
    private LocalDate data;
    private String status;
    private ItemPedido[] itens;
    private int indice = 0;
    private Cliente cliente;

    public Pedido(int numero, String status, LocalDate data, Cliente cliente) {
        this.numero = numero;
        this.status = status;
        this.data = data;
        this.itens = new ItemPedido[100];
        this.cliente = cliente;
    }

    void exibirDetalhes() {
        System.out.println("Numero do pedido: " + this.numero);
        System.out.println("Data de entrega: " + this.data);
        System.out.println("Status: " + this.status);
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : this.itens) {
            if(item != null)
            total += item.getSubTotal();
        }
        return total;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        itens[indice] = new ItemPedido(produto, quantidade);
        indice++;
    }
}
