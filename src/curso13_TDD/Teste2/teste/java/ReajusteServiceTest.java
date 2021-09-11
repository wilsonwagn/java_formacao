package curso13_TDD.Teste2.teste.java;

import curso13_TDD.Teste2.main.java.br.com.alura.tdd.modelo.Desempenho;
import curso13_TDD.Teste2.main.java.br.com.alura.tdd.modelo.Funcionario;
import curso13_TDD.Teste2.main.java.br.com.alura.tdd.service.ReajusteService;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {
    private ReajusteService service = new ReajusteService();
    private Funcionario func = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));;

    // Comando do JUnit para iniciar a classe abaixo antes de qualquer coisa!
    @BeforeEach
    public void inicializar(){
        this.service = new ReajusteService();
        this.func = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
    }

    // Depois que finalizar tudo!

    @AfterEach
    public void finalizar(){
        System.out.println("Testes finalizados!");
    }

    @BeforeAll
    public static void antesTodos(){
        System.out.println("Antes de todos");
    }

    @AfterAll
    public static void depoisTodos(){
        System.out.println("Depois de todos");
    }

    @Test
    public void reajusteADesejar(){
        service.concederReajuste(func, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), func.getSalario());
    }

    @Test
    public void reajusteBom(){
        service.concederReajuste(func, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), func.getSalario());
    }

    @Test
    public void reajusteOtimo(){
        service.concederReajuste(func, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1300.00"), func.getSalario());
    }
}
