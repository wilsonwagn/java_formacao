package atividades.objetos;

public class Elevador {
    // ————————————————————————————————————————— Atributos.
    private static int andarAtual; //Térreo
    private int totalAndares; //Desconsiderando o térreo

    private int capacidade;
    private int capacidadeUtilizada;

    // ————————————————————————————————————————— Métodos.
    public void Inicializa(int novaCapacidade, int novoTAndares){
        // Inicializa : que deve receber como
        //parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre
        //começam no térreo e vazio)
        this.capacidade = novaCapacidade;
        this.totalAndares = novoTAndares;
    }
    public void entra(){
        //Entra : para acrescentar uma pessoa no elevador (só deve acrescentar
        //se ainda houver espaço);
        if (capacidadeUtilizada < capacidade) {
            this.capacidadeUtilizada ++;
            System.out.println("Adicionado ao elevador");
        } else{
            System.out.println("Capacidade máxima atingida.");
        }
    }
    public void sai() {
        // Sai : para remover uma pessoa do elevador (só deve remover se houver
        //alguém dentro dele);
        if (capacidadeUtilizada > 0){
            this.capacidadeUtilizada--;
            System.out.println("Removido do elevador");
        }
    }
    public void sobe(){
        // Sobe : para subir um andar (não deve subir se já estiver no último andar);
        if (andarAtual < totalAndares){
            this.andarAtual++;
            System.out.println("Você subiu para o andar: "+this.andarAtual);
        }
    }
    public void desce(){
        // Desce : para descer um andar (não deve descer se já estiver no térreo);
        if (andarAtual > 0){
            andarAtual--;
            System.out.println("Você desceu para o andar: "+this.andarAtual);
        }
    }

    // ————————————————————————————————————————— GetS e Setters.

    public static int getAndarAtual() {
        return andarAtual;
    }

    public static void setAndarAtual(int andarAtual) {
        Elevador.andarAtual = andarAtual;
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
