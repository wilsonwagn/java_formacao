package curso09_JavaIO;

import java.io.*;


public class Test5Otimizaçao {
    public static void main(String[] args) throws IOException {
        // Maneira mais simples de Criar arquivo e escrever:

        //  Maneira 01:
        // FileWriter arquivo2 = new FileWriter("kk.txt"); | Outra maneira, a diferença é que é precisso add uma nova linha manualmente.
        BufferedWriter arquivo = new BufferedWriter(new FileWriter("texto5Otimizado.txt"));
        arquivo.write("Wilson Wagner");
        arquivo.newLine();
        arquivo.close();

        // Maneira 02:
        PrintStream ps = new PrintStream("texto5Otimizado2.txt", "UTF-8"); //Mesma coisa de PrintWritter.
        ps.println("Onika \nTanya");
        ps.println("Minaj");
        ps.close();


    }
}
