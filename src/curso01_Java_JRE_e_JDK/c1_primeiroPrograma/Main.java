package curso01_Java.c1_primeiroPrograma;

public class Main {

    public static void main(String[] args) {
        // Conta = nome da classe.
        // novaConta = Estanciando um novo objeto nessa variavel.

	    Conta novaConta = new Conta();
        novaConta.numConta = 123;
        novaConta.saldo = 987;

        System.out.println("— Número da Conta: " + novaConta.numConta);
        System.out.println("— Saldo da conta: " + novaConta.saldo);

    }
}
