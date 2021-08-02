package curso01_Java_JRE_e_JDK.c4_caracteres;

public class TestaCaracteres {
    public static void main(String[] args) {
        /* ————————————————————————— Caracteres ————————————————————————— */
        char letra = 'a'; //String de apenas 1 caractere e aspas simples.
        char letra2 = 66;
        System.out.println(letra);
        System.out.println(letra2); //Tira pela tabela ascap
        System.out.println(letra+letra2); //Soma pela tabela ascap

        /* Convertendo pela tabela ASCII*/
        letra2 = (char) (letra2+1);
        System.out.println(letra2);

        /* ————————————————————————— String ————————————————————————— */
        System.out.println("——————————————————————————————————————————————————");

        String palavra = "Nicki Minaj Rainha do Rap";
        palavra = palavra+" "+2020;
        System.out.println(palavra);

    }
}
