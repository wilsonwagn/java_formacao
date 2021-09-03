package atividades.objetos;

import java.util.ArrayList;

public class Caminhao {

    private String tipoCaminhao;
    private int quantTransportado;
    private ArrayList listaPluviometros;
    private int total;


    // ————————————————————————————————————————————— Construtor:

    public Caminhao(String tipo, int quant, ArrayList listaPluviometrosNova, int totalNovo){
        tipoCaminhao = tipo;
        quantTransportado = quant;
        listaPluviometros = listaPluviometrosNova;
        total = totalNovo;

    }
    // ————————————————————————————————————————————— GET and SET
    public String getTipoCaminhao() {
        return tipoCaminhao;
    }

    public void setTipoCaminhao(String tipoCaminhao) {
        this.tipoCaminhao = tipoCaminhao;
    }

    public int getQuantTransportado() {
        return quantTransportado;
    }

    public void setQuantTransportado(int quantTransportado) {
        this.quantTransportado = quantTransportado;
    }

    public ArrayList getListaPluviometros() {
        return listaPluviometros;
    }

    public void setListaPluviometros(ArrayList listaPluviometros) {
        this.listaPluviometros = listaPluviometros;
    }

    public int getTotal() {
        return total;
    }
}
