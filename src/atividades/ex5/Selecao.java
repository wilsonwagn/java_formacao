package atividades.ex5;

import atividades.objetos.Caminhao;

import java.util.ArrayList;

public class Selecao extends Controle{
    private static ArrayList<Caminhao> listaCaminhoes = new ArrayList();
    int numPluviometro;

    public void cadastraCaminhao(){
        ArrayList<String> tiposPluv = new ArrayList<>();
        while (true){
            String tipoCaminhao = leString("Digite entre 'Alfa' ou 'Beta', ou 'Fim' para sair: \n> ");
            if (tipoCaminhao.equals("Alfa") || tipoCaminhao.equals("Beta")) {
                while (true) {
                    System.out.println("Digite o número de pluviometro a ser transportado: ");
                    int numPluviometro = leInteiro(); //Quantidade de Pluviometro
                    if (numPluviometro > 0) {
                        for (int i = 0; i < numPluviometro; i++){
                            tiposPluv.add(leString("Digite o "+(i+1)+"º pluviometro: "));
                        }
                        listaCaminhoes.add(new Caminhao(tipoCaminhao, numPluviometro, tiposPluv));
                        tiposPluv = new ArrayList<>();
                        break;
                    } else if (numPluviometro <= 0){
                        System.out.println("É preciso ser maior que 0, tente novamente!");
                    }
                }
            } else if (tipoCaminhao.equals("fim") || tipoCaminhao.equals("Fim")){
                caminhoesCadastrados();
                break;
            }
        }
    }

    public void caminhoesCadastrados(){
        System.out.println("Atualmente temos "+listaCaminhoes.size()+" caminhões cadastrados: ");
        for (int x = 0; x<listaCaminhoes.size();x++){
            System.out.println("— Dados do "+(x+1)+"º caminhão: \n— Tipo: "+listaCaminhoes.get(x).getTipoCaminhao()+"\n— Quantidade de pluviometro: "+listaCaminhoes.get(x).getQuantTransportado()+"\n— Lista dos pluviometros: "+listaCaminhoes.get(x).getListaPluviometros()+"\n");
        }

    }
}
