package com.example.projetojpa01.controle;

import com.example.projetojpa01.dominio.Anime;
import com.example.projetojpa01.repositorio.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animes")
public class AnimeController {
    @Autowired
    private AnimeRepository repository;

    @GetMapping
    public ResponseEntity<List<Anime>> get() {
        List<Anime> lista = repository.findAll();
        return lista.isEmpty()
                ? ResponseEntity.status(204).build()
                : ResponseEntity.status(200).body(lista);
    }

    @PostMapping
    public ResponseEntity<Anime> post(@RequestBody Anime novoAnime) {
        repository.save(novoAnime);
        return ResponseEntity.status(201).body(novoAnime);
    }
}
