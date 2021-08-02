package atividades.ex1;

/*
*  Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de
nascimento e altura. Crie os métodos públicos necessários para sets e gets e
*
* também um método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.
* */

//Classe Mãe
public class Pessoa {
    // ————————————————————————————————————————— Atributos.
    private String nome;
    private String dataNascimento;
    private double altura;
    private int idade;

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

    public void getInfos(){
        System.out.println("Nome: "+nome + "\nData de Nascimento: "+dataNascimento+"\nAltura: "+altura+"\nIdade: "+idade);
    }
    // ————————————————————————————————————————— Métodos.


}