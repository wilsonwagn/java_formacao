package curso02_03_JavaOO_e_Polimorfismo.c2_ByteBank2;

public class TesteReferencias {
    public static void main(String[] args) {
        // Gerente:
        Gerente g1 = new Gerente();
        g1.setNome("Wilson Wagner");
        g1.setSalario(10000);

        // Editor de Video:
        EditorVideo v1 = new EditorVideo();
        v1.setSalario(2500);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(v1);
        System.out.println("Soma de todas bonificações: "+controle.getSoma());
    }
}
