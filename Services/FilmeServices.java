package com.projeto.projeto_fujioka_spring.Services;

import com.projeto.projeto_fujioka_spring.Model.Filme;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FilmeServices {
    Filme salvar(Filme filme);
    List<Filme> listarTodos();
    Filme buscarPorId(Long id);
    Filme atualizar(Long id, Filme filme);
    void deletar(Long id);
}