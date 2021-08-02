package curso02_03_JavaOO_e_Polimorfismo.c2_ByteBank2;

// Classe concreta

public class EditorVideo extends Funcionario {
    public double getBonificacao(){
        System.out.println("Editor de video | Estou recebendo minha bonificação de 100");
        return 100;
    }
}
