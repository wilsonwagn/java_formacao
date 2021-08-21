package atividades.ex1;

import atividades.objetos.Pessoa;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Atividade01 extends Pessoa {
    public Atividade01(String novoNome, double novaAltura, String novaDataNascimento) {
        super(novoNome, novaAltura, novaDataNascimento);
    }

    public void calcularIdade(){
        LocalDate dataHoje = LocalDate.now();
        LocalDate dataAniversario = formatandoData();
        Period diferencaTempo = Period.between(dataAniversario, dataHoje);
        System.out.println("A sua idade é: "+diferencaTempo.getYears());
    }

    public LocalDate formatandoData(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFormatada = LocalDate.parse(getDataNascimento(), formatter);
        return dataFormatada;
    }

}
