package atividades.objetos;
import java.util.ArrayList;
import java.util.List;

/*
. Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes
operações: */

public class Agenda extends Pessoa {
    // ————————————————————————————————————————— Atributos.
    private static ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

    // ————————————————————————————————————————— Métodos.

    public void armazenaPessoa(String nome, double altura, int idade){
       if (listaDePessoas.size() <= 10){
           listaDePessoas.add(new Pessoa(nome, altura, idade));
       } else {
           System.out.println("Só é possível adicionar 10 pessoas.");
       }
    }
    public void removePessoa(String nome){
        int contResposta = buscaPessoa(nome);
        if (contResposta == -1){
            System.out.println(nome+ " não foi encontrado no sistema.");
        } else {
            System.out.println(listaDePessoas.get(contResposta).getNome()+ " removido(a) com sucesso.");
            listaDePessoas.remove(contResposta);
        }
    }
    public int buscaPessoa(String nome){
        int cont = 0;
        boolean encontrou = false;
        while (cont<= (listaDePessoas.size()-1)){
            if (nome == listaDePessoas.get(cont).getNome()){
                encontrou = true;
                break;
            }
            cont+=1;
        }
        if (encontrou == false) {
            cont = -1;
        }
        return cont;

    }
    public void imprimeAgenda(){
        int cont = 0;
        while (cont <= (listaDePessoas.size()-1)){
            imprimePessoa(cont);
            cont+=1;
        }
        // imprime os dados de todas as pessoas da agenda
    }
    public void imprimePessoa(int index){
        String nome = listaDePessoas.get(index).getNome();
        Double altura = listaDePessoas.get(index).getAltura();
        int idade = listaDePessoas.get(index).getIdade();
        System.out.println("Nome: "+nome +"\nAltura: "+altura+"\nIdade: "+idade+"\n");
        //imprime os dados da pessoa que está na posição “i” da agenda.
    }
}
