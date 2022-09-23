package com.example.Exercicios3;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/lutadores")
public class LutadosController {

    private List<Lutadores> lutadores = new ArrayList<>();

    @PostMapping
    public Lutadores adicionarLutador(@RequestBody Lutadores novoLutador) {
        lutadores.add(novoLutador);
        return novoLutador;
    }
}
