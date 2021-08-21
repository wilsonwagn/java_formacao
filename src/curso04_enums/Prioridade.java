package curso04_enums;

public enum Prioridade {
    //Exemplo1:
    //SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;

    //Exemplo2:
    MIN(10), MAX(20);

    private int valor;
    Prioridade(int valor){
        this.valor = valor;
    }
    public int getValor() {
        return valor;
    }


}