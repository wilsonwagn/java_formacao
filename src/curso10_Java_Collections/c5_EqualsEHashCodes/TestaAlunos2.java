package curso10_Java_Collections.c5_EqualsEHashCodes;

import curso10_Java_Collections.objetos.*;

public class TestaAlunos2 {
    public static void main(String[] args) {


        // Aulas:
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));


        // Alunos:
        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        //Está matriculado?
        Aluno turini = new Aluno("Rodrigo Turini", 34672);

        System.out.println("E esse Turini, está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));
        System.out.println("A1 é equals turini?");
        System.out.println(a1.equals(turini));

        //True:
        System.out.println(a1.hashCode() == turini.hashCode());
    }
}
