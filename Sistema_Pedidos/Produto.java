package Sistema_Pedidos;

public class Produto {
    protected String nome;
    protected double preco;
    protected int estoque;
    protected String id;
    protected String descricao;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    void exibirDetalhes() {
        System.out.println("Produto: " + this.nome);
        System.out.printf("Preço: R$ %.2f\n", this.preco);
        System.out.println("Estoque: " + this.estoque);
        System.out.println("ID: " + this.id);
        System.out.println("Descrição: " + this.descricao);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade>0) {
            this.estoque += quantidade;
        }
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
