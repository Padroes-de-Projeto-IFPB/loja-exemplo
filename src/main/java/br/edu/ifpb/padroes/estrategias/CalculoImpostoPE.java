package br.edu.ifpb.padroes.estrategias;

import java.math.BigDecimal;

public class CalculoImpostoPE implements CalculoImposto {
    @Override
    public BigDecimal calcular() {
        return new BigDecimal("1.08")
                ;
    }
}
