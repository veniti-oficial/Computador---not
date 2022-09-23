package com.example.Exercicios2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/campanhas")
public class CampanhaController {

    private List<Campanha> campanha = List.of(
            new Campanha("Palmeiras", 10, 2, 2),
            new Campanha("Corinthans", 4, 2, 2),
            new Campanha("São Paulo", 6, 5, 1)
    );

    @GetMapping("/{posicao}")
    public Campanha campanha(@PathVariable Integer posicao) {
        return campanha.get(posicao);
    }

    @GetMapping
    public List<Campanha> getCampanha() {return campanha;}

}
