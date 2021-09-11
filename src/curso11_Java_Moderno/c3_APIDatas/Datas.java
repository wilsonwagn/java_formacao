package curso11_Java_Moderno.c3_APIDatas;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        LocalDate meuAniversario = LocalDate.of(1999, Month.JANUARY, 14);

        //Idade:
        int anos = meuAniversario.getYear()-hoje.getYear();
        System.out.println(anos);

        //Periodo:
        Period diferencaTempo = Period.between(meuAniversario, hoje);
        System.out.println(diferencaTempo.getDays());
        System.out.println(diferencaTempo.getMonths());
        System.out.println(diferencaTempo.getYears());

        //Incrementando e decrementando suas datas:
        System.out.println("-------------------------------------");
        System.out.println(hoje.minusYears(1));
        System.out.println(hoje.minusMonths(4));
        System.out.println(hoje.minusDays(2));
        System.out.println("-------------------------------------");
        System.out.println(hoje.plusYears(1));
        System.out.println(hoje.plusMonths(4));
        System.out.println(hoje.plusDays(2));
        System.out.println("-------------------------------------");

        //Formatando:
        LocalDate futuro = hoje.plusYears(4);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = futuro.format(formatador);
        System.out.println(valorFormatado);

        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        System.out.println(agora.format(formatador2));


    }

}

