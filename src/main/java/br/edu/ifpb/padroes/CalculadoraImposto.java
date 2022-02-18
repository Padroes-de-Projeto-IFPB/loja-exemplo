package br.edu.ifpb.padroes;

import java.math.BigDecimal;

public class CalculadoraImposto {

    public BigDecimal calcularImposto(String estado) {
        if (estado.equals("PB")) {
            return new BigDecimal("1.05");
        } else if (estado.equals("SP")) {
            return new BigDecimal("1.15");
        } else if (estado.equals("PE")) {
            return new BigDecimal("1.08");
        }
        return new BigDecimal("1.30");
    }

}
