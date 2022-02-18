package br.edu.ifpb.padroes.estrategias;

import java.math.BigDecimal;

public class CalculoImpostoEspecialDeCarnaval implements CalculoImposto {
    @Override
    public BigDecimal calcular() {
        return new BigDecimal("0.50");
    }
}
