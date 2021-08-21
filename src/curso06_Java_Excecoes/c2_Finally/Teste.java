package curso06_Java_Excecoes.c2_Finally;

public class Teste {
    public static void main(String[] args) {

        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch(IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        }


        /*
        // Maneira 1
        Conexao con = null;
        try {
            con = new Conexao();
            con.leDados();
        } catch(IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        } finally {
            con.close();
        }*/

        // Maneira 2:
        /*
        try {
            con = new Conexao();
            con.leDados();
        } finally {
            con.close();
        }*/
    }
}
