package curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Testes;

import curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos.Conta;
import curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos.ContaCorrente;
import curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos.SaldoInsuficienteException;

/**
 * Comentário da documentação
 * @author wilsonwanger
 * @version 1.0
 *
 */

public class TesteSacaComUnchecked {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);

        conta.deposita(200.0);
        try {
            conta.saca(200.0);
        } catch (SaldoInsuficienteException ex){
            System.out.println("ERROR: "+ex.getMessage());
        }
        System.out.println("\n> Seu saldo atual: "+conta.getSaldo());
    }
}
