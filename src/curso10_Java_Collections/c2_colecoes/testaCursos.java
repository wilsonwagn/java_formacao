package curso10_Java_Collections.c2_colecoes;

import curso10_Java_Collections.objetos.Aula;
import curso10_Java_Collections.objetos.Curso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class testaCursos {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
        System.out.println(aulas);

        //Não é possível fazer isso:
        // javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList NOVO 2021", 21));

        //——————————————————————————————————————————————————————————————————————————————————————————
        List<Integer> a = new ArrayList<>(Arrays.asList(50, 10, 90, 50, 30));
        //Inverter a ordem:
        Collections.reverse(a);
        System.out.println(a);

        //Embaralhar a ordem:
        Collections.shuffle(a);
        System.out.println(a);

        //Ordenar:
        Collections.sort(a);
        System.out.println(a);

        // devolve uma lista imutável que contêm um único elemento especificado.
        Collections.singletonList(a);
        System.out.println(a);




    }
}
