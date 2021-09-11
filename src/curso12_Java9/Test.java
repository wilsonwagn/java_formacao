package curso12_Java9;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        //Criando lista
        List<Integer> a = List.of(1, 2, 3, 4, 5);

        //Switch:
        String nome = "Wilson";
        switch (nome){
            case "nome1", "nome2", "Wilson" -> System.out.println("Achou o nome é: "+nome);
            default -> System.out.println("Não achou");
        }
    }
}
