package curso10_Java_Collections.c1_arrayList;

import java.util.*;

public class arrayListTests {
    public static void main(String[] args) {
        ArrayList<String> aulas = new ArrayList<>();
        String aula1 = "Olá mundo";
        String aula2 = "Meu nome";
        String aula3 = "é Wilson";
        String aula4 = "tudo bem com voces?";


        // Adicionando:
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula1);
        aulas.add(aula4);
        aulas.add(aula1);

        // Removendo:
        aulas.remove(0);

        // ForEach:
        aulas.forEach(x ->{
            // IndexOf = Retornar a posição do elemento. (Se for repetido, ele repete também.)
            System.out.println(aulas.indexOf(x)+" > "+x);
        });

        //Pegando posição:
        System.out.println(aulas.get(0));

        //Tamanho:
        System.out.println(aulas.size());

        //Sort:
        Collections.sort(aulas);
        System.out.println(aulas);

        //Colocando valores direto:
        List<String> lista = new ArrayList<String>(Arrays.asList("Grupo", "de", "Usuarios", "Java"));
        ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(10, 20, 30));
        System.out.println(lista2);

        // Somando todos os valores:
        int soma = lista2.stream().mapToInt(i -> i).sum();
        System.out.println(soma);


    }
}
