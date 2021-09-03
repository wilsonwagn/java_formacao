package atividades.ex5;
import java.util.Scanner;

public class Controle {

    public static String leString(String s){
        System.out.print(s);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static int leInteiro(){
        int valor = 0;
        Scanner valorDigitado = new Scanner(System.in);
        try {
            valor = Integer.parseInt(valorDigitado.nextLine());
        } catch (Exception ex){
            System.out.println("Você digitou um valor incorreto, precisa ser um número maior que 0. Tente novamnte! ");
        }
        return valor;
    }
}
