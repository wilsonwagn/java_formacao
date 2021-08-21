package curso08_Java_Util;
import curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos.*;

import java.util.*;

public class ArrayList4ComparandoStrings {
    public static void main(String[] args) {
        // ForEach = https://receitasdecodigo.com.br/java/exemplo-de-foreach-do-java-8


        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new Poupança(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(1119.0);

        Conta cc4 = new Poupança(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        //Sem ordenar nada:
        for (Conta conta : lista) {
            System.out.println(conta);
        }
        //Ordenando por String | Sem criar funções e deixando mais inxuto possivel:
        //Já pode citar a lista diretamente, pois a lista já foi atribuida a contas na linha 32.

        //Lambda
        //lista.sort((Conta c1, Conta c2) -> CharSequence.compare(c1.getTitular().getNome(), c2.getTitular().getNome()));

        // Ordenando por numero da conta
        //lista.sort((c1, c2) -> Integer.compare(c1.getNumero(),c2.getNumero()));

        System.out.println("—————————————————————————————————————");

        // Ordenando por ordem natural: Saldo | Ou seja, essa comparação está na classe conta.
        Collections.sort(lista); //Ordendo saldo

        for (Conta conta : lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }



    }
}
/*class TitularDaContaComparator implements Comparator<Conta> {

        @Override
        public int compare(Conta c1, Conta c2) {

            String nomeC1 = c1.getTitular().getNome();
            String nomeC2 = c2.getTitular().getNome();
            return nomeC1.compareTo(nomeC2);
        }
    }*/
