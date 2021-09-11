package curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos;

// CLASSE MÃE

import java.io.Serializable;
import java.util.Objects;

/**
 * Clase representa uma conta de maneira geral.
 * @author WilsonWagn
 */

public abstract class Conta implements Comparable<Conta>, Serializable {
    /**
     * Construtor para inicializar o objeto.
     *
     * @param agencia
     * @param numero
     */

    public Conta(int agencia, int numero) {
        Conta.total++; // Aqui guarda um valor estatico.
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("Estou criando uma conta: " + this.numero);
        //System.out.println("O total de contas criadas até o momento é "+ Conta.total);
    }

    // ————————————————————————————————————————— Atributos.
    double saldo; // Package Private | Apenas visivel no pacote.
    private int agencia;
    private int numero;
    private transient Cliente titular;
    private static int total = 0; //Aqui fica a quantidade de contas criadas.

    // ————————————————————————————————————————— Métodos.
    public static int getTotal() {
        return Conta.total;
    }

    public abstract void deposita(double valor);

    /**
     * Valor precisa ser maior que o saldo.
     *
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Você está sem saldo suficiente!" + "\nSaldo: " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) {
        this.saca(valor);
        destino.deposita(valor);

    }

    /* ————————————————————————————————————————————— GET and SET ————————————————————————————————————————————*/
    public double getSaldo() {
        return this.saldo;
    }

    ;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int novoNumero) {
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
    /* ————————————————————————————————————————————————————————————————————————————————————————————————————— */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Conta conta = (Conta) o;
        return Double.compare(conta.saldo, saldo) == 0 && agencia == conta.agencia && numero == conta.numero && Objects.equals(titular, conta.titular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saldo, agencia, numero, titular);
    }

    //A ordem natural das coisas definidas por mim para SORT:
    @Override
    public int compareTo(Conta o) {
        return Double.compare(this.saldo, o.saldo);
    }

}