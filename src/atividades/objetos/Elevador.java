package atividades.objetos;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int capacidadeUtilizada;

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidadeUtilizada() {
        return capacidadeUtilizada;
    }

    public void setCapacidadeUtilizada(int capacidadeUtilizada) {
        this.capacidadeUtilizada = capacidadeUtilizada;
    }
}
