package curso06_Java_Excecoes.c1_Try_Catch;

public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            // Exemplo de Try e Catch
            try {
                int a = i / 0;
            }
            catch (ArithmeticException ex){  // Outra maneira geral: catch (Exception ex))
                String msg = ex.getMessage(); // Explica o problema.
                // ex.printStackTrace(); // — Printa o rastro do problema;
                System.out.println("Erro — ArithmeticException" + msg);
                }
            }
            System.out.println("Fim do metodo2");
        }
}
