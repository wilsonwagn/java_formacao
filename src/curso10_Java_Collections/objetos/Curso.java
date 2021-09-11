package curso10_Java_Collections.objetos;

import curso10_Java_Collections.objetos.Aula;

import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>(); //LinkedHashset = adiciona na ordem. |
                                                // Treeset = guarda na ordem natural (precisa do Comparable)
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>(); //LinkedHashMap = adiciona na ordem

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public Aluno buscaMatriculado(int numero) {
        return matriculaParaAluno.get(numero);
    }

    // ———————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    //Retornando apenas visualização:
    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public int getTempoTotal() {
        /*
         * stream = devolve um objeto
         * mapToInt = mapeia os inteiros
         * sum = soma
         * */
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    //Retornar apenas leitura
    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    // ———————————————————————————————————————————————————————————————————————————————————————————————————————————————————————


    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }


    @Override
    public String toString() {
        return "[Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal()
                + ", aulas: + " + this.aulas + "]";
    }

    public void matricula(Aluno a1) {

        this.alunos.add(a1);
        this.matriculaParaAluno.put(a1.getNumeroMatricula(), a1);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }


}