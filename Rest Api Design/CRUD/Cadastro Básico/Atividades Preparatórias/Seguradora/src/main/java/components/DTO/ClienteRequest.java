package components.DTO;

import components.model.Cliente;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

public class ClienteRequest {

    @NotBlank
    private  String nome;
    @NotBlank
    private  String sobrenome;
    @NotBlank
    private  String cpf;
    @NotBlank
    private  String rg;
    @NotBlank
    private  String endereco;
    @NotBlank
    @Email
    private  String email;
    @NotBlank
    private  String telefone;

    public ClienteRequest(String nome, String sobrenome, String cpf, String rg, String endereco, String email, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public ClienteRequest() {
    }

    public Cliente paraCliente(){
        return new Cliente(nome,sobrenome,cpf,rg,endereco,email,telefone);
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
