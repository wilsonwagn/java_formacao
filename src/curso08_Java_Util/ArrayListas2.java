package curso08_Java_Util;

import curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos.*;

import java.util.*;

public class ArrayListas2 {
    public static void main(String[] args) {
        ArrayList<Conta> listasDeTipo = new ArrayList<>();
        ContaCorrente novaConta = new ContaCorrente(123, 321);
        Poupança novaConta2 = new Poupança(999, 777);
        Poupança novaConta3 = new Poupança(999, 777);

        listasDeTipo.add(novaConta);

        //Contem determinado elemento?
        System.out.println(listasDeTipo.contains(novaConta2));

        //Testando o metodo equals modificado:
        System.out.println(novaConta2.equals(novaConta3)); //Os objetos são iguais?
        System.out.println(novaConta2 == novaConta3); //Apontam para mesma referencia?

        // Lista duplamente encadeada = Mais eficiente.
        LinkedList listaEncadeada = new LinkedList(); //Menos eficiente quando precisar saber ultima posição, etc..

        // List é um objeto mãe das listas:
        List listaNormal = new LinkedList<>();

        // Vector
        Vector vetor = new Vector();

        // Collection (Classe Mãe), então posso fazer isso também, mas não é recomendando nesse caso de list's:
        Collection lista = new LinkedList();




    }
}
