package atividades.ex3;

import atividades.objetos.Elevador;

public class Test3 {
    public static void main(String[] args) {
        Elevador novoElevador = new Elevador();
        novoElevador.Inicializa(10, 15);

        novoElevador.entra();
        novoElevador.sai();
    }
}
