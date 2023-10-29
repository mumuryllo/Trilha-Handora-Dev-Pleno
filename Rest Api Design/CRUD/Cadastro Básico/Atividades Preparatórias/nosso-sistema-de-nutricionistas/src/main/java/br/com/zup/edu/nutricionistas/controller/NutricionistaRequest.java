package br.com.zup.edu.nutricionistas.controller;

import br.com.zup.edu.nutricionistas.config.CustomDateDeserializer;
import br.com.zup.edu.nutricionistas.model.Nutricionista;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

public class NutricionistaRequest {
    @NotBlank(message = "Não pode estar vazio o nome")
    private String nome;

    @NotBlank(message = "Não pode estar vazio o email")
    @Email(message = "digite um formato valido de email")
    private String email;

    @NotBlank(message = "Não pode estar vazio o CRN")
    @Length(min = 6,max = 6, message = "O CRN deve ter 6 numeros")
    private String CRN;

    @NotBlank(message = "Não pode estar vazio o CPF")
    @CPF(message = "Digite em um formato de CPF ex(735.662.690-00)")
    private String cpf;

    @NotNull(message = "Não pode estar vazio a data")
    @Past(message = "Digite datas no passado")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    private Date dataNascimento;



    public NutricionistaRequest(String nome, String email, String CRN, String cpf, Date dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.CRN = CRN;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public Nutricionista paraNutricionista(){
           return new Nutricionista(nome,email,CRN,cpf,dataNascimento);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCRN() {
        return CRN;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
}
