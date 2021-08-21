package curso08_Java_Util;

import curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos.*;
public class Arrays {
    public static void main(String[] args) {

        // ———————————————————————————————————————————————— Array | PRIMITIVOS
        int[] listaInteiros = new int[5]; // Array também é um objeto | Precisamos definir o tamanho.
        // ou
        int[] refs = {1,2,3,4,5};


        //Acesando determinada posição | atribuindo valor | tamanho:
        System.out.println(listaInteiros[0]);
        listaInteiros[0] = 989;
        System.out.println(listaInteiros[0]);
        System.out.println("Tamanho: "+listaInteiros.length);

        System.out.println(refs[2]);

        //———————————————————————————————————————————————— Array | REFERÊNCIAS:
        ContaCorrente[] listaContas = new ContaCorrente[5];
        ContaCorrente novaConta = new ContaCorrente(123, 321);
        listaContas[0] = novaConta;

        ContaCorrente ref = listaContas[0];
        System.out.println("Acessando a mesma coisa de 2 maneiras diferentes: \n"+listaContas[0].getAgencia()+" | "+ref.getAgencia());

        // ———————————————————————————————————————————————— Outros exemplos:
        Conta[] listaContas2 = {new ContaCorrente(12,25), new Poupança(99, 899)};
        Object[] listaObjetos = new Object[5]; // Lista de Objetos geral.

        // Pode referenciar de 2 maneirass:
        Conta ref2 = listaContas2[0];
        Poupança ref3 = (Poupança) listaContas2[1];

        System.out.println(ref2.getAgencia() + " | " + ref3.getAgencia());
    }
}
