package curso13_TDD.Teste2.teste.java;

import curso13_TDD.Teste2.main.java.br.com.alura.tdd.modelo.Funcionario;
import curso13_TDD.Teste2.main.java.br.com.alura.tdd.service.BonusService;
import org.junit.Test;
import java.math.BigDecimal;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;

public class BonusServiceTest {

    @Test
    public void test() throws IllegalAccessException {
        //Testa se o salario é muito alto para não dar bonus.
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Wilson", LocalDate.now(), new BigDecimal("25000")));
        assertEquals(new BigDecimal("0.00"), bonus);
    }

    @Test
    public void test2() throws IllegalAccessException {
        //Testa deveria dar os 10% do salário.
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Wilson", LocalDate.now(), new BigDecimal("2500")));
        assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    public void test3() throws IllegalAccessException {
        //Testa exatamente o valor 1000 em beneficio
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Wilson", LocalDate.now(), new BigDecimal("10000")));
        assertEquals(new BigDecimal("1000.00"), bonus);
    }

}

