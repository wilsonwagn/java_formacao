package curso10_Java_Collections.c7_Map;

import java.util.*;

public class test2 {
    public static void main(String[] args) {
        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");

        pessoas.keySet().forEach(idade -> {
            System.out.println(pessoas.get(idade));
        });
        System.out.println("\n");
        pessoas.values().forEach(idade -> {
            System.out.println(idade);
        });
    }
}
