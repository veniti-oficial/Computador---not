package com.example.Exercicios3;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/grifes")
public class grifesController {
    private List<Grifes> grifes = new ArrayList<>();

    @GetMapping
    public List<Grifes> mostrar() {
        return grifes;
    }

    @PostMapping
    public Grifes adicionarGrife(@RequestBody Grifes novaGrife) {
        grifes.add(novaGrife);
        return novaGrife;
    }

    @PutMapping("/posicao")
    public Grifes atualizarLista(@RequestBody Grifes novaGrife, @PathVariable Integer posicao) {
        if (posicao >= 0 && posicao < grifes.size()) {
            grifes.set(posicao, novaGrife);
            return novaGrife;
        }
        return null;
    }

    @DeleteMapping("/{posicao}")
    public String deletarPosicao(@PathVariable Integer posicao) {
        if(posicao >= 0 && posicao <= grifes.size()) {
            grifes.remove(posicao);
            return "Grife Excluida";
        }else {
            return "Não encontrada";
        }
    }
}
