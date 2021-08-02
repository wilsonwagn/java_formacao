package curso02_03_JavaOO_e_Polimorfismo.c2_ByteBank2;

public class Cliente implements Autenticavel{
    private AutenticacaoUtil novaAutenticacao; //Pegando da classe AutenticacaoUtil.

    public Cliente(){ //Construtor
        this.novaAutenticacao = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int novaSenha) {
        this.novaAutenticacao.setSenha(novaSenha);
    }

    @Override
    public boolean autentica(int senha) {
        boolean autenticou = this.novaAutenticacao.autentica(senha);
        return autenticou;
    }


}
