package components.controller;

import components.dto.LivroRequest;
import components.model.Livro;
import components.repository.LivroRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository repository;

    @PostMapping
    public ResponseEntity<Void> cadastrar(@RequestBody @Valid LivroRequest request, UriComponentsBuilder uriComponentsBuilder){
        Livro novoLivro = request.livrosRequest();

        repository.save(novoLivro);

        URI location = uriComponentsBuilder.path("/livros/{id}")
                .buildAndExpand(novoLivro.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

}
