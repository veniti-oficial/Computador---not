package sptech.projetospring01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/campanhas")
public class campanhaController {
    private List<Campanha> campanhas = List.of(
            new Campanha("Time A", 10, 5, 3),
            new Campanha("Time B", 4, 7, 4),
            new Campanha("Time C", 16, 3, 5),
            new Campanha("Time C", 20, 0, 0)
    );

    @GetMapping("/{posicao}")
    public Campanha campanhasN(@PathVariable Integer posicao) {
        if(posicao < 0 || posicao >= campanhas.size()) {
            return this.campanhas.get(posicao);
        }else {
            return null;
        }
    }

    @GetMapping
    public List<Campanha> getCampanhas() {
        return campanhas;
    }
}
