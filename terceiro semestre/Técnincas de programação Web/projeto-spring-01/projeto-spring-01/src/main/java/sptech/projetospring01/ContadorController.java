package sptech.projetospring01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContadorController {

    private int contador;

    @GetMapping("/contagem")
    public int getContador() {
        contador++;
        return contador;
    }
}
