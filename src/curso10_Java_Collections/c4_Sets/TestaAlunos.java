package curso10_Java_Collections.c4_Sets;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    /*
    * — SET:
    * - Não aceita elementos repetidos;
    * - Não tem uma ordem em adicionar;
    * - Nao pode adicionar, remover, etc pelo index;
    * */

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Nico Steppat"); // outro Nico Steppat, exatamente igual ao anterior

        System.out.println(alunos);
    }
}

