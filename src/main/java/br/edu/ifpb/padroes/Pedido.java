package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.estrategias.CalculoImposto;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Pedido {
    private LocalDateTime data;
    private Cliente cliente;
    private List<ItemPedido> itens;

    // Padrão STRATEGY
    private CalculoImposto calcularImposto;

    public BigDecimal obterTotalPedido() {
        BigDecimal total = new BigDecimal(0);
        for (ItemPedido item : itens) {
            total = total.add(item.obterSubtotal());
        }
        assert(calcularImposto != null);
        total = total.multiply(calcularImposto.calcular());
        return total;
    }

    public void adicionarItem(ItemPedido itemPedido) {
        if (itens == null) {
            itens = new ArrayList<>();
        }
        itens.add(itemPedido);
    }
    public void removerItem(ItemPedido itemPedido) {
        if (itens != null) {
            itens.remove(itemPedido);
        }
    }
}
