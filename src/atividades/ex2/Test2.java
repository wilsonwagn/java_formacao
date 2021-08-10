package atividades.ex2;

import atividades.objetos.Agenda;

public class Test2 {
    public static void main(String[] args) {
        Agenda novaAgenda = new Agenda();
        //  ————————————————————————————————————————— Adicionando pessoas:
        novaAgenda.armazenaPessoa("Bruno", 1.89, 22);
        novaAgenda.armazenaPessoa("Pedro", 1.11, 25);
        novaAgenda.armazenaPessoa("Wagner", 1.89, 21);
        novaAgenda.armazenaPessoa("Nicki", 1.79, 30);
        novaAgenda.armazenaPessoa("Minaj", 1.54, 02);
        novaAgenda.armazenaPessoa("Wilson", 1.41, 98);
        //  ————————————————————————————————————————— Buscando por nome:
        int index = novaAgenda.buscaPessoa("Wilson");
        novaAgenda.imprimePessoa(index);
        //  ————————————————————————————————————————— Removendo por nome:
        novaAgenda.removePessoa("Wilson"); //
        novaAgenda.removePessoa("Nicki Minaj"); //
        //  ————————————————————————————————————————— Mostrando todos:
        novaAgenda.imprimeAgenda();




    }
}
