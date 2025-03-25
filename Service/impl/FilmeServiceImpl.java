package com.projeto.projeto_fujioka_spring.Service.impl;

import com.projeto.projeto_fujioka_spring.Model.Filme;
import com.projeto.projeto_fujioka_spring.Repository.FilmeRepository;
import com.projeto.projeto_fujioka_spring.Services.FilmeServices;
import java.util.List;

public class FilmeServiceImpl implements FilmeServices {

    private FilmeRepository filmeRepository;

    @Override
    public Filme salvar(Filme filme) {
        return null;
    }

    @Override
    public List<Filme> listarTodos() {
        return null;
    }

    @Override
    public Filme buscarPorId(Long id) {
        return null;
    }

    @Override
    public Filme atualizar(Long id, Filme filme) {
        return null;
    }

    @Override
    public void deletar(Long id) {
    }
}
