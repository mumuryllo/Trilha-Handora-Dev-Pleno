package components.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String titulo;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private String isbn;
    @Column(nullable = false)
    private LocalDate dataPublicacao;

    public Livro(){

    }

    public Livro(String titulo, String descricao, String isbn, LocalDate dataPublicacao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.isbn = isbn;
        this.dataPublicacao = dataPublicacao;
    }

    public Long getId() {
        return id;
    }

}
