package sptech.projetospring01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


//Tudo que começa com @ são anotações, Anotações são uma forma de meta-programação
//meta-programação e uma programação sobre uma programação, ou seja ela acopla um programação
//esta anoração indica que essa classe terá chamados da API REST é uma classe controladora --> @restcontroller
@RestController
public class FrasesController {

    // A anotação e uma das formas de indivar que o metodo e uma chamada da api REST -->@Getmapping
    @GetMapping
    public String cumprimentar() {
        return "Bem vindos á minha API do S2";
    }

    @GetMapping("/despedir")
    public String despdir() {
        return "thau thau, até mais!";
    }

    @GetMapping("/elogiarao")
    public String elogiar() {
        return "Aula foda dimais";
    }

    @GetMapping("/botao")
    public String botao(){return "<button>botâo</button>";}


    //Aqui a URI possui dois PATH PARAMS(n1 e n2)
    //eles influenciam no resultado da chamada
    //eles foram atrelados aos parametros n1 e n2 respectivamente por causa da anotação @PathVariable
    //os parametros devem possuir o mesmo nome que contam na URI
    @GetMapping("/somar/{n1}/{n2}")
    public  Double somar(@PathVariable double n1,
                         @PathVariable double n2) {
        return n1 + n2;
    }

    @GetMapping("/pode-votar/{idade}")
    public Boolean podeVotar(@PathVariable Integer idade) {
        return idade >= 16;
    }

    @GetMapping("/resultado/{nota1}/{nota2}")
    public String i2(@PathVariable double nota1, @PathVariable double nota2) {
        if(((nota1 + nota2) / 2) >= 6) {
            return "Aprovado";
        }else {
            return "Tente outra vez";
        }
    }
}


