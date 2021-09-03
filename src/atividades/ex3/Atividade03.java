package atividades.ex3;

import atividades.objetos.Elevador;

public class Atividade03 {
    Elevador novoElevador = new Elevador();

    public void Inicializa(int novaCapacidade, int novoTAndares){
        novoElevador.setCapacidade(novaCapacidade);
        novoElevador.setCapacidade(novoTAndares);
    }
    public void entra(){
        if (novoElevador.getCapacidadeUtilizada() < novoElevador.getCapacidade()) {
            novoElevador.setCapacidadeUtilizada(+1);
            System.out.println("Adicionado ao elevador");
        } else{
            System.out.println("Capacidade máxima atingida.");
        }
    }
    public void sai() {
        if (novoElevador.getCapacidadeUtilizada() > 0){
            novoElevador.setCapacidadeUtilizada(+1);
            System.out.println("Removido do elevador");
        }
    }
    public void sobe(){
        if (novoElevador.getAndarAtual() < novoElevador.getTotalAndares()){
            novoElevador.setAndarAtual(+1);
            System.out.println("Você subiu para o andar: "+novoElevador.getAndarAtual());
        }
    }
    public void desce(){
        if (novoElevador.getAndarAtual() > 0){
            novoElevador.setAndarAtual(-1);
            System.out.println("Você desceu para o andar: "+novoElevador.getAndarAtual());
        }
    }
}
