package curso10_Java_Collections.objetos;

public class Aula implements Comparable<Aula> {
    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    //Printando:
    @Override
    public String toString() {
        return "["+titulo + ", " + tempo+"]";
    }

    // Comparando:
    @Override
    public int compareTo(Aula o) {
        return Integer.compare(this.tempo, o.tempo);
    }
}
