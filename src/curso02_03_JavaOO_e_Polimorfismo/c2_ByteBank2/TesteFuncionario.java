package curso02_03_JavaOO_e_Polimorfismo.c2_ByteBank2;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario nico = new Gerente();
        nico.setNome("Nico Steppat");
        nico.setCpf("223355646-9");
        nico.setSalario(2600.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());
    }
}
