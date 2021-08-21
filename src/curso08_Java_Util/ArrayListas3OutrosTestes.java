package curso08_Java_Util;
import curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos.*;

import java.util.*;

public class ArrayListas3OutrosTestes {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);

        Conta cc2 = new Poupança(22, 44);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111.0);

        Conta cc4 = new Poupança(22, 22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        // Sem ordenar por numero AINDA:
        for (Conta contas: lista){
            System.out.println(contas);
        }

        // Ordenando por numero do SALDO:
        lista.sort(new NumContaComparador());
        System.out.println("—————————————————————————————————");
        for (Conta contas: lista){
            System.out.println(contas);
        }
    }
}

class NumContaComparador implements Comparator<Conta>{
    @Override
    public int compare(Conta c1, Conta c2) {
        return (int) (c1.getSaldo() - c2.getSaldo());
    }
}