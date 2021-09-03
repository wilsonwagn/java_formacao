package curso07_Java_Lang;

import java.util.Arrays;
import java.util.Locale;

public class OutrosTests {
    public static void main(String[] args) {
        // Quando é apenas uma letra:
        char letra = 'a';

        // Tipos imutaveis precisam ser atribuidos em outras variaveis em Java:
        String palavra = "WIlSOn";
        String novaPalavra = palavra.toLowerCase();
        System.out.println(novaPalavra);

        //Determina posição por letra:
        char posicao = palavra.charAt(2);
        System.out.println("Posicao: "+posicao);

        // Posicao por mais de 1 letra:
        int pos2 = palavra.indexOf("SOn");
        System.out.println("Posicao2: "+pos2);

        // Posicao fatiada:
        System.out.println("Resultado cortado: " + palavra.substring(1));

        // Tamanho:
        System.out.println("Tamanho da palavra: " + palavra.length());

        // String está vazio?
        System.out.println("Está vazio? "+ palavra.isEmpty());

        // Remover vazios (apenas na frente e atras):
        String vazio = "    onika   ";
        String nVazio = vazio.trim();
        System.out.println("Sem vazios: "+nVazio);

        // Contem dentro da string?
        System.out.println("Contem 'nika'? = "+vazio.contains("nika"));

        //Remover determinado caractere e criando uma lista de palavras:
        String palavra2 = "WilsonsdfWagnersdfDossdf";
        String[] palavra3 = palavra2.split("sdf");
        System.out.println("> "+ Arrays.toString(palavra3));

    }
}
