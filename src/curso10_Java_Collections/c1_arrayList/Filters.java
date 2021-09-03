package curso10_Java_Collections.c1_arrayList;

import java.util.*;
import java.util.stream.Collectors;

public class Filters {
    public static void main(String[] args) {
        // Adicionando na lista diretamente:
        List<String> listaNomes = Arrays.asList("Wilson", "John", "Jack", "Wagner");

        //Pegando todos com a letra "J" | Filter:
        List<String> result = listaNomes.stream().filter(name -> name.startsWith("J"))
                .collect(Collectors.toList());

        //Pegando todos com a letra "J" | Filter:
        String result2 = listaNomes.stream().filter(name -> name.startsWith("J"))
                .collect(Collectors.joining(", "));
        System.out.println(result);
        System.out.println(result2);

        //Optionals surgiram para evitar nullPointerExceptions:
        Optional<String> result3 = listaNomes.stream()
                .filter(name -> name.startsWith("W"))
                .findAny(); //Encontre algum
        System.out.println(result3.isPresent()); //Confere se tem algo | Apenas para Optional.

        // —————————————————————————————————————————————————————————————————————————————————————————————————


    }
}
