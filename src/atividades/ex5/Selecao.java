package atividades.ex5;

import atividades.objetos.Caminhao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Selecao extends Controle{
    ArrayList<Caminhao> listaCaminhoes = new ArrayList<>();
    ArrayList<Integer> tiposPluv = new ArrayList<>();

    public void cadastraCaminhao(){
        while (true){
            String tipoCaminhao = leString("Digite entre 'Alfa' ou 'Beta', ou 'Fim' para sair: \n> ");
            if (tipoCaminhao.equals("Alfa") || tipoCaminhao.equals("Beta")) {
                while (true) {
                    System.out.println("Digite o número de pluviometro a ser transportado: ");
                    int numPluviometro = leInteiro(); //Quantidade de Pluviometro
                    guardaValores(numPluviometro, tipoCaminhao);
                    break;
                }
            } else if (tipoCaminhao.equals("fim") || tipoCaminhao.equals("Fim")){ caminhoesCadastrados(); break;}
        }
    }

    public void guardaValores(int numPluviometro, String tipoCaminhao){
        int total;
        if (numPluviometro > 0) {
            for (int i = 0; i < numPluviometro; i++){
                System.out.print("Digite o "+(i+1)+"º pluviometro: ");
                tiposPluv.add(leInteiro());
            }
            total = tiposPluv.stream().mapToInt(i -> i).sum();
            listaCaminhoes.add(new Caminhao(tipoCaminhao, numPluviometro, tiposPluv, total));
            tiposPluv = new ArrayList<>();
        }
    }
    public void caminhoesCadastrados(){
        System.out.println("Atualmente temos "+listaCaminhoes.size()+" caminhões cadastrados: ");
        for (int x = 0; x<listaCaminhoes.size();x++){
            System.out.println("— Dados do "+(x+1)+"º caminhão: \n— Tipo: "+listaCaminhoes.get(x).getTipoCaminhao()+"\n— Quantidade de pluviometro: "+
                    listaCaminhoes.get(x).getQuantTransportado()+"\n— Lista dos pluviometros: "+listaCaminhoes.get(x).getListaPluviometros()+"\n");
        }

    }

    public void melhor(){
        ArrayList<Integer> valores = new ArrayList<>();
        listaCaminhoes.forEach(x-> {valores.add(x.getTotal());});
        System.out.println("Melhor Caminhão "+ (valores.indexOf(Collections.max(valores))+1) + "º e tem no total: " + listaCaminhoes.get(valores.indexOf(Collections.max(valores))).getTotal());
    }
}
