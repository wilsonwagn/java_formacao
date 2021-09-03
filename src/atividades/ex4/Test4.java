package atividades.ex4;

import atividades.objetos.ControleRemoto;
import atividades.objetos.Televisao;

public class Test4 {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        ControleRemoto controle = new ControleRemoto();

        controle.trocarCanal(99, tv);
        controle.aumentarVolume(tv);
        System.out.println(String.format("Você está no canal %s e o seu volume atualmente é %s", tv.getCanalAtual(), tv.getVolume()));

    }
}
