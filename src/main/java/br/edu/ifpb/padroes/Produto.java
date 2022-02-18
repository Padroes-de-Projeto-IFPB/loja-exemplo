package br.edu.ifpb.padroes;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Produto {
    private String nome;
    private BigDecimal preco;
}
