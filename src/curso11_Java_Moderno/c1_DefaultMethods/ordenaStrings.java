package curso11_Java_Moderno.c1_DefaultMethods;

import java.util.*;
import java.util.function.Consumer;

public class ordenaStrings {
    public static void main(String[] args) {

        //Ordenando na maneira padrão:
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        Collections.sort(palavras);
        System.out.println(palavras);

        //Ordenando do meu jeito | Nova maneira:
        Comparator<String> comparador = new ComparadorDeStringPorTamanho();
        palavras.sort(comparador);
        System.out.println(palavras);

        //printando | novaManeira
        Consumer<String> consumidor = new ConsumidorDeString();
        palavras.forEach(consumidor);


    }
}

class ConsumidorDeString implements Consumer<String> {
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorDeStringPorTamanho implements Comparator<String> {
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length())
            return -1;
        if(s1.length() > s2.length())
            return 1;
        return 0;
    }
}