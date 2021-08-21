package curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos;

// Classe filha
public class Poupança extends Conta{
    public Poupança(int agencia, int conta){
        super(agencia, conta);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public String toString() {
        return "ContaPoupança: " + super.getNumero() + " | Agencia: "+ super.getAgencia() + " | Saldo: " + super.getSaldo();

    }
}
