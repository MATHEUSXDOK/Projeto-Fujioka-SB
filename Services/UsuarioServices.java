package com.projeto.projeto_fujioka_spring.Services;

import com.projeto.projeto_fujioka_spring.Model.Usuario;
import java.util.List;

public interface UsuarioServices {
    Usuario salvar(Usuario usuario);
    List<Usuario> listarTodos();
    Usuario buscarPorId(Long id);
    Usuario atualizar(Long id, Usuario usuario);
    void deletar(Long id);

}
