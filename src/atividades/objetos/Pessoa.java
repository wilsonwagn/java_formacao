package atividades.objetos;

//Classe Mãe

public class Pessoa {
    // ————————————————————————————————————————— Atributos.
    private String nome;
    private String dataNascimento;
    private double altura;
    private int idade;

    // ————————————————————————————————————————— Construtor.
    public Pessoa(){}

    public Pessoa(String novoNome, double novaAltura, String novaDataNascimento){
        this.nome = novoNome;
        this.altura = novaAltura;
        this.dataNascimento = novaDataNascimento;
    }

    public Pessoa(String novoNome, double novaAltura, int novaIdade){
        this.nome = novoNome;
        this.altura = novaAltura;
        this.idade = novaIdade;
    }

    // ————————————————————————————————————————— Gets e Sets.

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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}