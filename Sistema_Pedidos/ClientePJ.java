package Sistema_Pedidos;

public class ClientePJ extends Cliente{
    private String cnpj;
    private String razaoSocial;
    private String inscricaoEstadual;

    public ClientePJ(String nome, String email, String id, String telefone, String cnpj){
        super(nome, email, id, telefone);
        this.cnpj = cnpj;
    }

    public String getCNPJ() {
        return this.cnpj;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    public String getIdentificadorUnico() {
        return this.cnpj;
    }
}
