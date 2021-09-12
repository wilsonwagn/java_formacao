package atividades.ex1;

import atividades.objetos.Pessoa;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Atividade01 {

    public String calcularIdade(Pessoa pessoa) {
        try {
            LocalDate dataHoje = LocalDate.now();
            LocalDate dataAniversario = formatandoData(pessoa.getDataNascimento());
            Period diferencaTempo = Period.between(dataAniversario, dataHoje);
            return "A sua idade é: " + diferencaTempo.getYears();
        } catch (Exception ex){
            return "Informe uma data corretamente!";
        }
    }
    public LocalDate formatandoData(String dataNascimento){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFormatada = LocalDate.parse(dataNascimento, formatter);
        System.out.println(dataFormatada);
        return dataFormatada;
    }

}