package curso02_03_JavaOO_e_Polimorfismo.c2_ByteBank2;

//Essa classe tem como objetivo apenas adicionar uma senha e verificar.
// Utilizada em Cliente, Gerente e Administrador.

public class AutenticacaoUtil {

    private int senha;

    public void setSenha(int novaSenha) {
        this.senha = novaSenha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }
}
