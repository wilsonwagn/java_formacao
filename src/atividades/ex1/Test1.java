package atividades.ex1;

import atividades.objetos.Pessoa;

public class Test1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Nicki Minaj", 157.7, "08/12/1982");
        Atividade01 atv = new Atividade01();
        atv.calcularIdade(pessoa);


    }

}
