package curso13_TDD.Teste2.main.java.br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
    A_DESEJAR{
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.03");
        }
    }, BOM {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.15");
        }
    }, OTIMO {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.30");
        }
    };

    public abstract BigDecimal percentualReajuste();
}
