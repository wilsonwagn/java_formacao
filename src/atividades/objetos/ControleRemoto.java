package atividades.objetos;

public class ControleRemoto {
    //Televisao tv = new Televisao();

    public void aumentarVolume(Televisao tv){
        if (tv.getVolume() >= 0 && tv.getVolume() <= 100){
            tv.setVolume(tv.getVolume()+1);}}

    public void diminuirVolume(Televisao tv){
        if (tv.getVolume() >= 0 && tv.getVolume() <= 100){
            tv.setVolume(tv.getVolume()-1);}}

    public void aumentarCanais(Televisao tv){tv.setCanais(tv.getCanais()+1);}

    public void diminuirCanais(Televisao tv){tv.setCanais(tv.getCanais()-1);}

    public void trocarCanal(int novoCanal, Televisao tv){
        tv.setCanalAtual(novoCanal);}

}
