package atividades.ex1;

import atividades.objetos.Pessoa;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Atividade01Test {

    Atividade01 atv;
    String resultado;

    public void inicializa(Pessoa pessoa){
        atv = new Atividade01();
        resultado = atv.calcularIdade(pessoa);
    }

    @Test
    public void test(){
        Pessoa pessoa = new Pessoa("Nicki Minaj", 157.7, "08/12/1982");
        inicializa(pessoa);
        assertEquals("A sua idade é: 38", resultado);
    }

    @Test
    public void test2(){
        Pessoa pessoa = new Pessoa("João da Silva", 170, "10/04/2000");
        inicializa(pessoa);
        assertEquals("A sua idade é: 21", resultado);
    }

}