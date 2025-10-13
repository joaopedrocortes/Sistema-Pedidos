package Sistema_Pedidos;

import java.time.LocalDate;

public class ClientePF extends Cliente{
    private String cpf;
    private LocalDate dataNascimento;

    public ClientePF(String nome, String email, String id, String telefone, String cpf) {
        super(nome, email, id, telefone);
        this.cpf = cpf;
    }

    public String getCPF() {
        return this.cpf;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public String getIdentificadorUnico() {
        return this.cpf;
    }
}
