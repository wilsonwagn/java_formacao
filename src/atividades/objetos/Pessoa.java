package atividades.objetos;

//Classe Mãe

import java.math.BigDecimal;

public class Pessoa {

    private String nome;
    private String dataNascimento;
    private BigDecimal altura;
    private int idade;

    public Pessoa(String novoNome, double novaAltura, String novaDataNascimento){
        this.nome = novoNome;
        this.altura = new BigDecimal(Double.toString(novaAltura));
        this.dataNascimento = novaDataNascimento;
    }

    public Pessoa(String novoNome, double novaAltura, int novaIdade){
        this.nome = novoNome;
        this.altura = new BigDecimal(Double.toString(novaAltura));
        this.idade = novaIdade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public BigDecimal getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = new BigDecimal(Double.toString(altura));
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}