package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.estrategias.*;

import java.math.BigDecimal;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Factory
        HashMap<String, CalculoImposto> calculos = new HashMap<>();
        calculos.put("PB", new CalculoImpostoPB());
        calculos.put("PE", new CalculoImpostoPE());
        calculos.put("SP", new CalculoImpostoSP());

        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente();
        cliente.setEmail("diego.pessoa@ifpb.edu.br");
        cliente.setNome("Diego Pessoa");
        cliente.setEstado("PE");
        pedido.setCliente(cliente);
//        pedido.setCalcularImposto(calculos.get(cliente.getEstado()));

        // Strategy
        pedido.setCalcularImposto(new CalculoImpostoEspecialDeNatal());

        Produto coxinha = new Produto();
        coxinha.setNome("Coxinha");
        coxinha.setPreco(new BigDecimal("5.45"));
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setProduto(coxinha);
        itemPedido.setQuantidade(5);
        pedido.adicionarItem(itemPedido);

        Produto suco = new Produto();
        suco.setNome("Suco de Laranja");
        suco.setPreco(new BigDecimal("3.45"));
        ItemPedido itemPedido2 = new ItemPedido();
        itemPedido2.setProduto(suco);
        itemPedido2.setQuantidade(2);
        pedido.adicionarItem(itemPedido2);

        System.out.println(pedido.obterTotalPedido());
    }
}
