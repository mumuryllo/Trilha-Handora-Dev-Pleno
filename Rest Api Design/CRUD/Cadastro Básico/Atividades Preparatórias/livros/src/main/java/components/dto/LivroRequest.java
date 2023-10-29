package components.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import components.model.Livro;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

public class LivroRequest {

    @NotBlank
    @Length(max = 200)
    private String titulo;
    @NotBlank
    @Length(max = 4000)
    private String descricao;
    @NotBlank
    @Length(max = 13, min = 13)
    private String isbn;
    @NotNull
    @Past
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataPublicacao;

    public LivroRequest (){

    }

    public LivroRequest(String titulo, String descricao, String isbn, LocalDate dataPublicacao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.isbn = isbn;
        this.dataPublicacao = dataPublicacao;
    }

    public Livro livrosRequest(){
        return  new Livro(titulo,descricao,isbn,dataPublicacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }
}
