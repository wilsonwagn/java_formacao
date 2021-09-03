package curso08_Java_Util;

import curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos.*;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListas {
    public static void main(String[] args) {
        // Criando ArrayList | adicionando | tamanho:
        ArrayList lista = new ArrayList();
        ContaCorrente novaConta = new ContaCorrente(123, 321);
        Poupança novaConta2 = new Poupança(999, 777);
        lista.add(novaConta);
        lista.add(novaConta2);
        System.out.println("Tamanho: " + lista.size());

        //Determinada posição:
        Conta ref = (Conta) lista.get(0);
        System.out.println(ref);
        System.out.println(ref.getNumero());

        // Removendo:
        lista.remove(0);

        // Nova maneira de rodar um laço em objetos:
        lista.add(novaConta2);
        lista.add(novaConta2);
        System.out.println("Novo for: \n");
        for(Object referencia : lista){
            System.out.println(referencia);
        }

        // Criar lista de um determinado tipo | Gerenics = <> | Utilizar o Gerenics é importante sempre que possivel:
        ArrayList<Conta> listasDeTipo = new ArrayList<>();
        listasDeTipo.add(novaConta);
        System.out.println("\n>>> " + listasDeTipo.get(0));
        for(Conta referencia : listasDeTipo){
            System.out.println(referencia);
        }

        // Tamanho Pré-definido:
        ArrayList listaTamanhoDefinida = new ArrayList(10); //Com tamanho definido
        listaTamanhoDefinida.add("RJ");
        listaTamanhoDefinida.add("SP");

        // Atribuir uma lista em outra lista.
        ArrayList nova = new ArrayList(listaTamanhoDefinida); //criando baseado na primeira lista
        System.out.println(nova);

    }
}