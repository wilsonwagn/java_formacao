package curso01_Java_JRE_e_JDK.c6_laços;

import java.util.Arrays;
import java.util.List;

public class TestaLaços2 {
    public static void main(String[] args) {
        List<Integer> itens = Arrays.asList(1, 2, 3, 4, 5 );
        // Maneira de encontrar um determinado valor que é PASSADO ANTES:

        //Maneira 01 (normal):
        for(Integer item : itens){
            if ( item == 4 )
                System.out.println(item);
        }
        //Maneira 02:
        itens.stream().filter(i -> i == 4).forEach(System.out::println);

        //Maneira 03:
        itens.forEach(x -> {
            if (x == 2){
                System.out.println("Valor encontrado!");
            }
        });

        // Sabendo a posição na lista do VALOR ENCONTRADO:
        itens.forEach(x -> {
            if (x == 2){
                System.out.println("A posição do valor '2' na lista é: "+itens.indexOf(x));
            }
        });
    }
}
