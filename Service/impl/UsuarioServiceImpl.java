package com.projeto.projeto_fujioka_spring.Service.impl;

import com.projeto.projeto_fujioka_spring.Model.Usuario;
import com.projeto.projeto_fujioka_spring.Repository.UsuarioRepository;
import com.projeto.projeto_fujioka_spring.Services.UsuarioServices;
import java.util.List;

public class UsuarioServiceImpl implements UsuarioServices {

    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario salvar(Usuario usuario) {
        return null;
    }

    @Override
    public List<Usuario> listarTodos() {
        return null;
    }

    @Override
    public Usuario buscarPorId(Long id) {
        return null;
    }

    @Override
    public Usuario atualizar(Long id, Usuario usuario) {
        return null;
    }

    @Override
    public void deletar(Long id) {
    }
}
