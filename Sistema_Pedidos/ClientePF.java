package Sistema_Pedidos;

public class ClientePF extends Cliente{
    String cpf;

    public ClientePF(String nome, String email, String cpf) {
        super(nome, email);
        this.cpf = cpf;
    }
}
