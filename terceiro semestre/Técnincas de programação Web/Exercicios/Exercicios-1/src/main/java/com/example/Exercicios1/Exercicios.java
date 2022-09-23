package com.example.Exercicios1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class Exercicios {
    private List<String> herois = List.of("Hulk", "Homem de ferro", "Capitão America", "Thor");

    @GetMapping("/pode-votar/{idade}")
    public Boolean idadeVotar(@PathVariable Integer idade) {
        return idade > 16;
    }

    @GetMapping("/resultado/{nota1}/{nota2}")
        public String resultado(@PathVariable Integer nota1, @PathVariable Integer nota2) {
        Integer media = (nota1 + nota2) / 2;
            if(media >= 6) {
                return "Aprovado!";
        }else {
                return "Tente outra vez!";
            }
    }

    @GetMapping("/recuperar/{posicao}")
    public String recuperarHeroi(@PathVariable Integer posicao) {
        if(posicao < herois.size() && posicao >= 0) {
            return herois.get(posicao);
        }else {
            return "Posição inválida";
        }
    }

    @GetMapping("/atualizar/{posicao}/{novoNome}")
    public String mudarPosicao(@PathVariable Integer posicao, @PathVariable String novoNome) {
        if(posicao < herois.size() && posicao >= 0) {
            this.herois.set(posicao, novoNome);
            return "Atualizado!";
        }else {
            return "Heroi não encontrado! #DeuRuim";
        }
    }

    @GetMapping("/excluir/{posicao}")
    public String deletarHeroi(@PathVariable Integer posicao) {
        if(posicao < herois.size() && posicao >= 0) {
            herois.remove(posicao);
            return "Excluído";
        }else{
            return "Heroi não encontrado! #DeuRuim";
        }
    }
}
