package curso02_03_JavaOO_e_Polimorfismo.c1_ByteBank;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    private static int total = 0;

    public static int getTotal() {
        return Conta.total;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    };

    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
        };

    public boolean transfere(double valor, Conta destino){
        if (saca(valor)){
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    };

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int novoNumero){
        this.numero = novoNumero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int novaAgencia) {
        this.agencia = novaAgencia;
    }

    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Conta(int agencia, int numero){
        Conta.total ++; // Aqui guarda um valor estatico.
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        //System.out.println("Estou criando uma conta: " + this.numero);
        //System.out.println("O total de contas criadas até o momento é "+ Conta.total);
    }
}