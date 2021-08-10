package atividades.objetos;
/*
*. Crie uma classe Televisão e uma classe Controle Remoto que pode controlar o volume e trocar os
canais da televisão. O controle de volume permite:
- Aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
- Aumentar e diminuir o número do canal em uma unidade.
- Trocar para um canal indicado;
- Consultar o valor do volume de som e o canal selecionado.

* */
public class Televisao {
    private int volume; //
    private int canais; // Aumentar e diminuir o número do canal em uma unidade.
    private int canalAtual;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanais() {
        return canais;
    }

    public void setCanais(int canais) {
        this.canais = canais;
    }

    public int getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(int canalAtual) {
        this.canalAtual = canalAtual;
    }
}
