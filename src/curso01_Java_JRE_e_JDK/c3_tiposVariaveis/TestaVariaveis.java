package curso01_Java_JRE_e_JDK.c3_tiposVariaveis;

public class TestaVariaveis {
    public static void main(String[] args) {

        System.out.println("Tipos e variáveis");
        System.out.println("——————————————————————————————————————————————————");

        /* ————————————————————————— inteiro ————————————————————————— */
        int idade = 21 + 10;
        idade = (5 * 7) + 2;
        System.out.println(idade);
        System.out.println("A idade é: " + idade);
        System.out.println("——————————————————————————————————————————————————");

        /* ————————————————————————— ponto flutuante ————————————————————————— */
        double salario = 3000.99;
        double divisaoLouca = 5/2; //Não printa 2.5, precisa ser 5.0 ou 2.0 um dos lados.

        System.out.println("Meu salário atual é " + salario);
        System.out.println("Meu salário atual com descontos é " + salario/2);
        System.out.println("——————————————————————————————————————————————————");

        /* ————————————————————————— Transformando valores ————————————————————————— */
        double salario2 = 1270.50;
        int valor = (int) salario2;
        System.out.println("Convertendo float para inteiro: " + valor);

        int numeroGrande; //Pode guardar até 2 bilhões.
        long numeroGrande2 = 1234567891012L; //2 bilhões ao quadrado.
        short valorPequeno; //Até 16 bits
        byte valorAleatorio; //-128 até 127

        double pontoFlutuante1; //Ponto flutuante de até 64bits
        float pontoFlutuante = 3.4f; //Guarda valores quebrados de até 32 bits

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1+valor2;
        System.out.println("Valor estranho: " + valor1+valor2 + " | valor estranho 2: " + total);

    }
}
