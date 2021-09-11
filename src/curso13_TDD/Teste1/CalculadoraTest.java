package curso13_TDD.Teste1;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void somarDoisPositivos(){
        Calculadora calc = new Calculadora();
        int r = calc.somar(2, 8);

        Assert.assertEquals(10, r); //Verifica soma;
    }
}
