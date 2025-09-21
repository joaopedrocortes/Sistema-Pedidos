package Sistema_Pedidos;

public class ClientePJ extends Cliente{
    String cnpj;

    public ClientePJ(String nome, String email, String cnpj){
        super(nome, email);
        this.cnpj = cnpj;
    }
}
