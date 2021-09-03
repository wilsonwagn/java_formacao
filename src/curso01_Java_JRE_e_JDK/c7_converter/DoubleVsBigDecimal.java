package curso01_Java_JRE_e_JDK.c7_converter;

import java.math.BigDecimal;

public class DoubleVsBigDecimal {
    public static void main(String[] args) {
        // Gerando valor incorreto:
        double d1 = 0.1;
        double d2 = 0.2;
        System.out.println(d1 + d2);

        // Usando o BidDecimal para resolver os problemas:
        BigDecimal big1 = new BigDecimal("0.1"); // Colocar sempre os valores em string.
        BigDecimal big2 = new BigDecimal("0.2");
        BigDecimal bigResult = big1.add(big2); // Somando valores com BigDecimal
        System.out.println(bigResult.toString());

        big1 = new BigDecimal("10.5");
        System.out.println(String.format("%s, %s, %s", big1, big2, bigResult));



        /*

        // —————————————————————————————————————————————————————————————————————————————————————————————————————
        System.out.println("Subtrai");
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.1")));

        System.out.println("");
        System.out.println("Soma");
        System.out.println(new BigDecimal("2.00").add(new BigDecimal("1.2")));

        System.out.println("");
        System.out.println("Compara");
        System.out.println(new BigDecimal("2.00").compareTo(new BigDecimal("2.009")));

        System.out.println("");
        System.out.println("Divide");
        System.out.println(new BigDecimal("2.00").divide(new BigDecimal("2.00")));

        System.out.println("");
        System.out.println("Máximo");
        System.out.println(new BigDecimal("2.00").max(new BigDecimal("1.5")));

        System.out.println("");
        System.out.println("Mínimo");
        System.out.println(new BigDecimal("2.00").min(new BigDecimal("1.6")));

        System.out.println("");
        System.out.println("Potência");
        System.out.println(new BigDecimal("2.00").pow(2));

        System.out.println("");
        System.out.println("Multiplica");
        System.out.println(new BigDecimal("2.00").multiply(new BigDecimal("1.8")));

        // BigDecimal não faz arendondamentos, nesses casos, é preciso definir as casas decimais que queremos aredondar:
        System.out.println("");
        System.out.println("Divide");
        System.out.println(new BigDecimal("1.00").divide(new BigDecimal("1.3"),3, RoundingMode.UP));
*/
    }
}
