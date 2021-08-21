package curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Testes;

import curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos.ContaCorrente;
import curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos.Poupança;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 111);
        Poupança cp = new Poupança(222, 222);

        cc.deposita(200);
        cp.deposita(200);

        cc.transfere(50,cp);
        double saldoCorrente = cc.getSaldo();
        double saldoPoupanca = cp.getSaldo();
        System.out.println(saldoCorrente+" "+saldoPoupanca);

        //Definindo os prints depois:
        System.out.println(cc);
        //Sem definir:
        System.out.println(cp);
    }
}
