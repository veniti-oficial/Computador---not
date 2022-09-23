package com.example.Basic;
//Já o requestMapping tem que ser plural
//ERA PRA SER MÉTODO POST o primeiro<<<<<<<<<<<<<<<<<<<<<<<
//

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping({"/grifes"})
public class ChamadaController {
 private List<Chamadas> chamada= new ArrayList<>(List.of(
         new Chamadas("Veniti", 2023, 300.000, "dragao007"),
         new Chamadas("teste", 2020, 23.00, "chaveTeste")
 ));


    @PostMapping("/adicionar")
    public Chamadas adicionar(@RequestBody Chamadas novaEmpresa) {
        chamada.add(novaEmpresa);
        return novaEmpresa;
    }

    @GetMapping({"/mostrar"})
    public List<Chamadas> mostrar() {
        return chamada;
    }

    @PutMapping({"/{posicao}"})
    public Chamadas putGrife(@PathVariable Integer posicao, @RequestBody Chamadas grife) {
        if(posicao >= 0 && posicao < chamada.size()) {
            chamada.set(posicao, grife);
            return grife;
        }else{
            return null;
        }
    }

    @DeleteMapping({"{poicao}"})
    public String removeGrife(@PathVariable Integer posicao) {
        if(posicao >= 0 && posicao < chamada.size()) {
            chamada.remove(posicao);
            return "Grife excluida";
        }else {
            return "Não encontrada";
        }
    }
}
