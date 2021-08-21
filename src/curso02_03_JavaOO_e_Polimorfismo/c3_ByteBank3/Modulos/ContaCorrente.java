package curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos;

// Classe filha
public class ContaCorrente extends Conta implements Tributavel{
    // Construtor padrão da classe mãe:
    public ContaCorrente(int agencia, int conta){
        super(agencia, conta);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    // É importante utilizarmos o @Override, o compilador sabe que a intenção é de sobrescrever o método:
    @Override
    public void saca(double valor) {
        double valorASacar = valor + 0.9;
        super.saca(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    @Override
    public String toString() {
        return "ContaCorrente: " + super.getNumero() + " | Agencia: "+ super.getAgencia() + " | Saldo: " + super.getSaldo();
    }
}
