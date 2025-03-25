package com.projeto.projeto_fujioka_spring.Controller;

import com.projeto.projeto_fujioka_spring.Model.EntidadeBase;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/base")
public class ControllerBase {

    @GetMapping
    public EntidadeBase exemploMetodoGET() {
        return EntidadeBase
                .builder()
                .nome("Aula de Spring Boot para BackEnd")
                .ano(2025)
                .build();
    }

    @PostMapping
    public EntidadeBase exemploMetodoPost(@RequestBody EntidadeBase entidadeBase) {
        return entidadeBase;
    }
}
