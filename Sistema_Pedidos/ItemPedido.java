package Sistema_Pedidos;

public class ItemPedido {
    private int quantidade;
    private Produto produto;
    private double precoUnitario;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = produto.getPreco();
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getPrecoUnitario() {
        return this.precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getSubTotal() {
        return this.precoUnitario * this.quantidade;
    }

    public void adicionarQuantidade(int quantidade){
        this.quantidade += quantidade; 
    }
}
