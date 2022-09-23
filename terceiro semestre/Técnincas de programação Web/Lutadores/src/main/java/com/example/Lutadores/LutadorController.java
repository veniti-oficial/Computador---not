package com.example.Lutadores;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/lutadores")
public class LutadorController {
    private List<Lutador> lutador = new ArrayList<>(List.of(
            new Lutador("teste1", 10, 6),
            new Lutador("teste2", 18, 10)
    ));


    @GetMapping("/listar")
    public List<Lutador> getLutador() {
        return lutador;
    }

//    @PatchMapping("/{posicaoBate}/golpe/{posicaoApanha}")
//    public Lutador lutar(@PathVariable Integer posicaoBate, @PathVariable Integer posicaoApanha) {
//
//    }


}
