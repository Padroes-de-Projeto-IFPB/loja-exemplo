package br.edu.ifpb.padroes;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public BigDecimal obterSubtotal() {
        assert(produto != null);
        assert(quantidade > 0);
        return produto.getPreco()
                .multiply(new BigDecimal(quantidade));
    }

}
