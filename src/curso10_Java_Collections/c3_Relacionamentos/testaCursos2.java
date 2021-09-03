package curso10_Java_Collections.c3_Relacionamentos;

import curso10_Java_Collections.objetos.Aula;
import curso10_Java_Collections.objetos.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testaCursos2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

        //Imutaveis = não pode ser manipulado.
        List<Aula> aulasImutaveis = javaColecoes.getAulas(); //read-only

        //Mutavel = pode ser manipulado.
        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulasMutaveis);
        System.out.println(aulasMutaveis);
        System.out.println(javaColecoes.getTempoTotal());
        System.out.println(javaColecoes);

    }
}
