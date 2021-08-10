package atividades.objetos;

public class ControleRemoto extends Televisao {
    public void aumentarVolume(){
        if (getVolume() >= 0 && getVolume() <= 100){
            int volumeAtual = getVolume()+1;
            setVolume(volumeAtual);
        }
    }
    public void diminuirVolume(){
        if (getVolume() >= 0 && getVolume() <= 100){
            int volumeAtual = getVolume()-1;
            setVolume(volumeAtual);
        }
    }

    public void aumentarCanais(){
        int numCanal = getCanais()+1;
        setCanais(numCanal);
    }
    public void diminuirCanais(){
        int numCanal = getCanais()-1;
        setCanais(numCanal);
    }

    public void trocarCanal(int novoCanal){
        setCanalAtual(novoCanal);
    }

}
