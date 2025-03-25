package com.projeto.projeto_fujioka_spring.Model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@Getter
@Setter
public class EntidadeBase {
    private String nome;
    private int ano;
}
