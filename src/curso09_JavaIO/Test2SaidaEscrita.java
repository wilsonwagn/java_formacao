package curso09_JavaIO;

import java.io.*;

public class Test2SaidaEscrita {
    public static void main(String[] args) throws IOException {
        // o java.io está repleto de exceções checked.

        // Fluxo de entrada com arquivo.
        OutputStream fos = new FileOutputStream("texto2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        // Escrevendo:
        bw.write("O QUINTO ÁLBUM ESTÁ VINDO PLEASEEEE \nPlease queenn");

        bw.close();


    }
}
