package curso08_Java_Util;

import java.util.*;

public class iterator {
    public static void main(String[] args) {

        // Exemplo 01
        /*
        List<String> nomes = new ArrayList<>();
        nomes.add("Super Mario");
        nomes.add("Yoshi");
        nomes.add("Donkey Kong");

        Iterator<String> it = nomes.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }*/

        // Exemplo 02
        
        Set<String> nomes = new HashSet<>();
        nomes.add("Super Mario");
        nomes.add("Yoshi");
        nomes.add("Donkey Kong");

        Iterator<String> it = nomes.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
