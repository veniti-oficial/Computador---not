package com.example.aula1409;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/frutas")
public class FrutaController {
    //Toda chamada agora vai ter que ser ResponseEntity
    private List<Fruta> frutas= new ArrayList<>();

    //o .body é para mostrar o corpo lá no postman
    @PostMapping
    public ResponseEntity<Fruta> post(@RequestBody Fruta novaFruta) {
        frutas.add(novaFruta);
        return ResponseEntity.status(201).body(novaFruta);
    }


    //o .build e só pra dizer que o corpo e vazio
    @GetMapping
    public ResponseEntity<List<Fruta>> get() {
        if(frutas.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(frutas);
    }

    @GetMapping("{posicao}")
    public ResponseEntity<Fruta> get(@PathVariable Integer posicao) {
        if(posicao < 0 || posicao > frutas.size()) {
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.status(200).body(frutas.get(posicao));
    }
}
