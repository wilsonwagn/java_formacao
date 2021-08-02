package curso02_03_JavaOO_e_Polimorfismo.c2_ByteBank2;

public class TesteSistema {
    public static void main(String[] args) {
        //Criando um sistema:

        //Gerente, administrador e Cliente conseguem ter acesso, mesmo sendo níveis diferente.
        Gerente g1 = new Gerente();
        g1.setSenha(0000);

        Administrador adm = new Administrador();
        adm.setSenha(3333);

        Cliente novoCliente = new Cliente();
        novoCliente.setSenha(4444);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g1);
        si.autentica(adm);
        si.autentica(novoCliente);


    }
}
