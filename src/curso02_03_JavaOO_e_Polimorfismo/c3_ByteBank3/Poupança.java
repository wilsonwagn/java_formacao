package curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3;

// Classe filha
public class Poupança extends Conta{
    public Poupança(int agencia, int conta){
        super(agencia, conta);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
