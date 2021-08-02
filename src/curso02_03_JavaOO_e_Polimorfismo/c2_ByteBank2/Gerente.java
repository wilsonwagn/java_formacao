package curso02_03_JavaOO_e_Polimorfismo.c2_ByteBank2;

// Classe concreta
// Gerente é um funcionário | Gerente herda da classe Funcionário | Assina o contrato autenticável.
public class Gerente extends Funcionario implements Autenticavel{

    private AutenticacaoUtil novaAutenticacao; //Pegando da classe AutenticacaoUtil.

    public Gerente(){ //Construtor
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

    @Override
    public double getBonificacao() {
        System.out.println("Gerente | Estou recebendo minha bonificação de 500");
        return super.getSalario();
    }
}