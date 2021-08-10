package atividades.ex4;

import atividades.objetos.ControleRemoto;

public class Test4 {
    public static void main(String[] args) {
        ControleRemoto novaTV = new ControleRemoto();
        novaTV.trocarCanal(1);
        novaTV.aumentarVolume();
        System.out.println("Você está no canal " + novaTV.getCanalAtual() + " e sua TV está no volume " + novaTV.getVolume());
    }
}
