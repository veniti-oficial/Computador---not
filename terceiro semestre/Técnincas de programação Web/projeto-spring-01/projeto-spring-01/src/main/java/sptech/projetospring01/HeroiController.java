package sptech.projetospring01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/heroi") //herois passa a ser o inicio de todos as URIs desta controller
public class HeroiController {

    private List<String> herois = List.of("hulk", "flash", "Naruto", "Luffy", "ichigo");

    @GetMapping
    public String home(){
        return "Bem vindos á API de Hérois" +
                "Hérois cadastrados:" + this.herois.size();
    }

    @GetMapping("/cadastrar/{heroi}")
    public String cadastrar(@PathVariable String heroi){
        this.herois.add(heroi);
        return "Heroi cadastrado com sucesso";
    }

    @GetMapping("/atualizar")
    public String atualizar(){
        return "Heroi atualizado com sucesso!";
    }

    @GetMapping("/recuperar/{posicao}")
    public String trazerHeroi(@PathVariable Integer posicao){
        return this.herois.get(posicao);
    }

    @GetMapping("/atualizar/{posicao}/{novoNome}")
    public String atualizarHeroi(@PathVariable Integer posicao, @PathVariable String novoNome){
        if(this.herois.size() > posicao) {
            this.herois.set(posicao, novoNome);
            return "Atualizado!";
        }else {
            return "Heroi não encontrado #deu ruim";
        }
    }

    @GetMapping("/excluir/{posicao}")
    public String excluirP(@PathVariable Integer posicao){
        if(this.herois.size() > posicao) {
            this.herois.remove(posicao);
            return "Excluido!";
        }else {
            return "Heroi não encontrado #deu ruim";
        }
    }



}
