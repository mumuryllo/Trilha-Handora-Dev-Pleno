package components.Autores.controller;

import components.Autores.dto.AutorRequest;
import components.Autores.model.Autor;
import components.Autores.repository.AutorRepository;
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
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorRepository repository;

    @PostMapping
    public ResponseEntity<Void> cadastrar (@RequestBody @Valid AutorRequest request, UriComponentsBuilder uriComponentsBuilder){

        Autor novoAutor = request.paraAutor();
        repository.save(novoAutor);


        URI location = uriComponentsBuilder.path("/autores/{id}")
                .buildAndExpand(novoAutor.getId()).toUri();

        return  ResponseEntity.created(location).build();
    }

}
