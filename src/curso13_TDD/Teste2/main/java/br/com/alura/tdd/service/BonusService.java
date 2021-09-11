package curso13_TDD.Teste2.main.java.br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import curso13_TDD.Teste2.main.java.br.com.alura.tdd.modelo.Funcionario;

public class BonusService {


	public BigDecimal calcularBonus(Funcionario funcionario) throws IllegalAccessException {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalAccessException("Funcionário ultrapassou 1000 em bonus!");
		}
		return valor.setScale(2, RoundingMode.HALF_UP); //Arredondando para cima com 2 casas decimas!
	}

}
