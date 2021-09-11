package curso11_Java_Moderno.c2_Streams;

import java.util.*;
import java.util.stream.Collectors;

public class CursoTeste {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        // Ordenando:
        cursos.sort(Comparator.comparing(Curso::getAlunos));

        // Filtrando
        System.out.println("----------------1---------------");
        cursos.stream()
                .filter(x->x.getAlunos()>=100)
                .forEach(x-> System.out.println(x.getNome() + " " + x.getAlunos()));

        // Mapeando
        System.out.println("----------------2---------------");
        cursos.stream()
                .filter(x->x.getAlunos()>=100)
                .map(Curso::getAlunos)
                .forEach(System.out::println);

        //Somando:
        System.out.println("----------------3---------------");
        int a = cursos.stream()
                .filter(x->x.getAlunos()>1)
                .mapToInt(Curso::getAlunos)
                .sum();
        System.out.println(a);

        //Convertendo para booleano:
        System.out.println("---------------4----------------");
        // FindFirst = Primeiro que encontrar | FindAny = qualquer um que encontrar.
        boolean existe = cursos.stream()
                .filter(x->x.getNome() == "Python")
                .findFirst()
                .isPresent();
        System.out.println(existe);

        //Pegando valor de Stream:
        System.out.println("----------------5---------------");
        Curso b = cursos.stream()
                .filter(x->x.getAlunos() > 100)
                .findFirst()
                .get();

        System.out.println(b.getNome());

        // Máximo:
        System.out.println("----------------6---------------");
        Curso cursoMaior = cursos.stream().max(Comparator.comparing(Curso::getAlunos)).get();
        System.out.println(cursoMaior.getAlunos());

        // Media:
        System.out.println("----------------7---------------");
        OptionalDouble curso = cursos.stream().filter(x->x.getAlunos()>100).mapToInt(Curso::getAlunos).average();
        System.out.println(curso.getAsDouble());

        //Criando lista com Stream:
        List<Curso> listaCursos = cursos.stream()
                .filter(x->x.getAlunos()>100)
                .collect(Collectors.toList());

        //Criando map com stream:
        cursos.stream() //ou: Map<String, Integer> mapCursos =
                .filter(x->x.getAlunos()>100)
                .collect(Collectors.toMap(c->c.getNome(), c->c.getAlunos()))
                .forEach((nome, numALunos) -> System.out.println(nome + " tem "+numALunos)); //(chave, valor)

        //paraLlelStream() melhora o processamento (ao invés de utilizar stream()).

    }
}
