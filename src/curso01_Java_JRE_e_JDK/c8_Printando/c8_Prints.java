package curso01_Java_JRE_e_JDK.c8_Printando;

public class c8_Prints {
    public static void main(String[] args) {

        // +Detalhes:

        //%s = String e geral
        //%d = inteiro
        //%f = double ou float

        String nome = "Wilson";
        String sobrenome = "Wagner";
        System.out.println(String.format("1> O meu nome é %s %s..", nome, sobrenome));

        //ou

        System.out.println("2> O meu nome é "+nome+" "+sobrenome+"..");
    }
}
