package br.edu.ifpb.padroes.estrategias;

import java.math.BigDecimal;

public class CalculoImpostoSP implements CalculoImposto {
    @Override
    public BigDecimal calcular() {
        return new BigDecimal("1.15");
    }
}
