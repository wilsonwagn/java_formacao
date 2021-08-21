package curso06_Java_Excecoes.c2_Finally;

public class Conexao implements AutoCloseable {
    public Conexao() {
        System.out.println("Abrindo conexao");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }
    // Obrigatório por padrão quando adicionado o AutoCloseable:
    @Override
    public void close() {
        System.out.println("Fechando conexao");
    }
}
