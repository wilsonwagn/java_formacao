package curso02_03_JavaOO_e_Polimorfismo.c2_ByteBank2;

public class ControleBonificacao {
    private double soma;

    public void registra(Funcionario g){
        double bonificacao = g.getBonificacao();
        this.soma += bonificacao;
    }

    public double getSoma() {
        return soma;
    }
}
