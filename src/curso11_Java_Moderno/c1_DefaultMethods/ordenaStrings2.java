package curso11_Java_Moderno.c1_DefaultMethods;

import java.util.*;

public class ordenaStrings2 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        // Threads com lambda!
        new Thread(() -> System.out.println("Executando um Runnable")).start();

        //Ordenando pelo tamanho:
        // palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        // ou

        //palavras.sort(Comparator.comparing(s->s.length()));
        palavras.sort(Comparator.comparing(String::length)); //ou palavras.sort(comparing(String::length));


        //Printando na ordem.
        palavras.forEach(System.out::println);




    }
}
