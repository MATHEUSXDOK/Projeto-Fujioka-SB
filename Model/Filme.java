package com.projeto.projeto_fujioka_spring.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.Mapping;

import static jakarta.persistence.GenerationType.*;
@Data
@Entity
@Table(name = "tb_filme")
public class Filme {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String titulo;
    private String autor;
}
