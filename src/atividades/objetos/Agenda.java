package atividades.objetos;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Agenda {
    private static ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
    Integer pessoaEncontradaIndex;

    public void armazenaPessoa(String nome, double altura, int idade) {
        if (listaDePessoas.size() <= 10) {
            listaDePessoas.add(new Pessoa(nome, altura, idade));}}

    public void removePessoa(String nome) {
        boolean encontrado = listaDePessoas.stream().filter(o -> o.getNome().equals(nome)).findFirst().isPresent();
        if(encontrado){ listaDePessoas.remove(buscaPessoa(nome));}};

    public int buscaPessoa(String nome) {
        listaDePessoas.forEach(x -> { 
            if (nome.equals(x.getNome())) {
                pessoaEncontradaIndex = listaDePessoas.indexOf(x);};});
        return pessoaEncontradaIndex;};

    public void imprimeAgenda() {
        listaDePessoas.forEach(x -> { imprimePessoa(listaDePessoas.indexOf(x)); });};

    public void imprimePessoa ( int index){
        String nome = listaDePessoas.get(index).getNome();
        BigDecimal altura = listaDePessoas.get(index).getAltura();
        int idade = listaDePessoas.get(index).getIdade();
        System.out.println("Nome: "+nome +"\nAltura: "+altura+"\nIdade: "+idade+"\n");}
}