package com.projeto.projeto_fujioka_spring.Repository;

import com.projeto.projeto_fujioka_spring.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
