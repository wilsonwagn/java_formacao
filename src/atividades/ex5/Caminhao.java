package atividades.ex5;

import java.util.ArrayList;

public class Caminhao {

    private String tipoCaminhao;
    private int quantTransportado;
    private ArrayList<String> listaPluviometros = new ArrayList<String>();

    // ————————————————————————————————————————————— Construtor:

    public Caminhao(String tipo, int quant, ArrayList listaPluviometrosNova){
        tipoCaminhao = tipo;
        quantTransportado = quant;
        listaPluviometros = listaPluviometrosNova;
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

    public ArrayList<String> getListaPluviometros() {
        return listaPluviometros;
    }

    public void setListaPluviometros(ArrayList<String> listaPluviometros) {
        this.listaPluviometros = listaPluviometros;
    }
}
