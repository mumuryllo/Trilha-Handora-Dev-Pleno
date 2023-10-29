package br.com.zup.edu.nutricionistas.model;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Nutricionista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String CRN;
    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private Date dataNascimento;

    public Nutricionista(){

    }

    public Nutricionista(String nome, String email, String CRN, String cpf, Date dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.CRN = CRN;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public Long getId(){
        return  id;
    }

}
