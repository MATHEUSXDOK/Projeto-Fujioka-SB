package com.projeto.projeto_fujioka_spring.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.projeto.projeto_fujioka_spring.Repository.FilmeRepository;
import com.projeto.projeto_fujioka_spring.Model.Filme;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    private FilmeController service;

    @GetMapping
    public List<Filme> listar() {
        return FilmeRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Filme> inserir(@RequestBody Filme filme) {
        return FilmeRepository.save(filme);
    }

    @PutMapping
    public ResponseEntity<Filme> alterar(@RequestBody Filme filme) {
        return service.alterar(filme);
    }

    @DeleteMapping("/{id}")

    public ResponseEntity<Filme> deletar(@PathVariable Integer id) {
        service.deletar(id);
        return ResponseEntity.ok().build();
    }
}