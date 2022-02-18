package br.edu.ifpb.padroes;

import java.math.BigDecimal;

public class Bigdec {

    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("500.99");
        System.out.println(bigDecimal
                .add(new BigDecimal("20.22"))
                .subtract(new BigDecimal("10.5")
                .multiply(new BigDecimal(4))));
    }
}
