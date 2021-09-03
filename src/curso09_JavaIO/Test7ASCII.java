package curso09_JavaIO;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Test7ASCII {
    public static void main(String[] args) throws UnsupportedEncodingException {

        //Transformando caractere para dec na tabela ASCII
        String letra = "w";
        System.out.println("> Código da letra 'w' > "+letra.codePointAt(0));
        
        // ———————————————————————————————————————————————— Qual o encoding utilizado?
        Charset c = Charset.defaultCharset();
        System.out.println("> Resposta: "+c.displayName());

        // —————————————————————————————————————————————————————— obtermos os bytes:
        byte[] bytes = letra.getBytes("windows-1252");
        System.out.println(bytes.length + ", windows-1252");
        String sNovo = new String(bytes, "windows-1252");
        System.out.println(String.format("> Transformando de bytes(%s) para caractere(%s)", bytes, sNovo));

        bytes = letra.getBytes("UTF-16");
        System.out.println(+bytes.length + ", UTF-16");
        sNovo = new String(bytes, "UTF-16");
        System.out.println(sNovo);

        bytes = letra.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes.length + ", US-ASCII");
        sNovo = new String(bytes, "US-ASCII");
        System.out.println(sNovo);

        // ———————————————————————————————————————————————————————————————————————————
        /*

        // Transformado dec/ASCII para caractere:
        String sNovo = new String(bytes);
        System.out.println("> " + sNovo);*/



    }
}
