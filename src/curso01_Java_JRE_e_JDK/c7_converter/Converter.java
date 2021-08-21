package curso01_Java_JRE_e_JDK.c7_converter;

public class Converter {
    public static void main(String[] args) {
        // String para Inteiro.
        String valor = "10";
        int valorConvertido = Integer.parseInt(valor);

        // Inteiro para String.
        int a = 5;
        String a2 = Integer.toString(a);

        // String para Boolean.
        String kk = "true";
        boolean resultado = Boolean.parseBoolean(kk);

        // Double para Int:
        double valor4 = 50.5;
        int valorRes = (int) valor4;
        System.out.println("Prints: " + valorConvertido + " | " + a2 + " | " + resultado + " | " + valorRes);
    }
}
