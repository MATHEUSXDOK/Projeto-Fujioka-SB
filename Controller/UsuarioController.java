package com.projeto.projeto_fujioka_spring.Controller;

import com.projeto.projeto_fujioka_spring.Model.Filme;
import com.projeto.projeto_fujioka_spring.Model.Usuario;
import com.projeto.projeto_fujioka_spring.Repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {

    private UsuarioController service;

    @GetMapping
    public List<Usuario> listar() {
        return UsuarioRepository.findAll();
    }

    @PutMapping
    public ResponseEntity<Usuario> alterar(@RequestBody Usuario usuario) {
        return service.alterar(usuario);
    }

    @PostMapping
    public ResponseEntity<Usuario> inserir(@RequestBody Usuario usuario) {
        return UsuarioRepository.save(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> deletar(@PathVariable Integer id) {
        service.deletar(id);
        return ResponseEntity.ok().build();
    }
}