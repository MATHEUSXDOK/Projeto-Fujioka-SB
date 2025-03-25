package com.projeto.projeto_fujioka_spring.Repository;

import com.projeto.projeto_fujioka_spring.Model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}


