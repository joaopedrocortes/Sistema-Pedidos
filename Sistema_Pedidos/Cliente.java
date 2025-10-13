package Sistema_Pedidos;

public abstract class Cliente {
    protected String nome;
    protected String email;
    protected String id;
    protected String telefone;

    public Cliente(String nome, String email, String id, String telefone) {
        this.nome = nome;
        this.email = email;
        this.id = id;
        this.telefone = telefone;
    }

    void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("ID: " + this.id);
        System.out.println("Telefone: " + this.telefone);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public abstract String getIdentificadorUnico();
}
