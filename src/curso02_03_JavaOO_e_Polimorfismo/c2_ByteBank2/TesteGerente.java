package curso02_03_JavaOO_e_Polimorfismo.c2_ByteBank2;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("235568413");
        g1.setSalario(5000.0);
        // Testando com senha:
        System.out.println(g1.getNome() + " | " + g1.getCpf());
        g1.setSenha(12345);
        boolean autenticado = g1.autentica(12345);
        System.out.println("Usuario "+autenticado + " no sistema.");

        // Testando com Protected:
        double valor = g1.getBonificacao();
        System.out.println("O seu salário atual é " + g1.getSalario() + " e bonificação é "+valor);
    }
}
