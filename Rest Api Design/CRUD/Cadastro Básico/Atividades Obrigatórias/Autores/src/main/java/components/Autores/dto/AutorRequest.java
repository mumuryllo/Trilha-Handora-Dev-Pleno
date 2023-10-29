package components.Autores.dto;

import components.Autores.model.Autor;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

public class AutorRequest {
    @NotBlank(message = "Não pode estar vazio o nome")
    @Length(max = 120)
    private String nome;

    @NotBlank(message = "Não pode estar vazio o email")
    @Email(message = "digite um formato valido de email")
    @Length(max = 120)
    private String email;
    @NotBlank(message = "Não pode estar vazio a descrição")
    @Length(max = 2500)
    private String descricao;
    @NotBlank(message = "Não pode estar vazio o CPF")
    @CPF(message = "Digite em um formato de CPF ex(735.662.690-00)")
    private String cpf;

    @Deprecated
    public AutorRequest(){

    }

    public AutorRequest(String nome, String email, String descricao, String cpf) {
        this.nome = nome;
        this.email = email;
        this.descricao = descricao;
        this.cpf = cpf;
    }

    public Autor paraAutor(){
        return new Autor(nome,email,descricao,cpf);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCpf() {
        return cpf;
    }
}
