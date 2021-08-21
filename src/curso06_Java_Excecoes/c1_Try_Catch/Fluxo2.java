package curso06_Java_Excecoes.c1_Try_Catch;

public class Fluxo2 {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        /*
        Maneiras de colocar as exceções:
        - (ArithmeticException ex)
        - (NullPointerException ex)
        - (NullPointerException | ArithmeticException ex) | Em 1 dos casos.
        - (Exception ex) | Maneira geral.
        */
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
            String msg = ex.getMessage(); // Explica o problema.
            System.out.println("CRIANDO UM PROBLEMA: " + msg);
        }
        System.out.println("Fim do main");
    }

    // MANEIRA CHECKED DE EXCEÇÕES:
    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");

        throw new MinhaExcecao(" DEU RUIM KKKKKKKKKKKKKKKKKkk");
        //System.out.println("Fim do metodo2");
    }
}