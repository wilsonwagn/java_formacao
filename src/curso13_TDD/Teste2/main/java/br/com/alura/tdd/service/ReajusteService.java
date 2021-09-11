package curso13_TDD.Teste2.main.java.br.com.alura.tdd.service;

import curso13_TDD.Teste2.main.java.br.com.alura.tdd.modelo.Desempenho;
import curso13_TDD.Teste2.main.java.br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Funcionario func, Desempenho desempenho) {
        BigDecimal reajuste = func.getSalario().multiply(desempenho.percentualReajuste());
        func.reajustarSalario(reajuste);
    }
}
