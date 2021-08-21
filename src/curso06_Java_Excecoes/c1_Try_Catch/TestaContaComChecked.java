package curso06_Java_Excecoes.c1_Try_Catch;

public class TestaContaComChecked {
    public static void main(String[] args) {
        ContaTest c = new ContaTest();
        try {
            c.deposita();
            System.out.println("Sem problemas......");
        } catch(MinhaExcecao ex){
            System.out.println("Entrou no erro............");
        }


    }
}
