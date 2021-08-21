package curso09_JavaIO;

import java.io.*;
import java.util.Scanner;

public class Test1EntradaLeitura {
    public static void main(String[] args) throws IOException {
        // o java.io está repleto de exceções checked.

        // Fluxo de entrada com arquivo.
        FileInputStream fis = new FileInputStream("texto.txt"); //Criando fluxo concreto em Binário
        InputStreamReader isr = new InputStreamReader(fis); // Transformando de binário para caractere

        //Ler 1 linha:
        BufferedReader br = new BufferedReader(isr);
        String linha = br.readLine();

        //Importante sempre fechar o arquivo.
        System.out.println("Lendo uma linha: " + linha);
        System.out.println("—————————————————————————————");
        System.out.println("Lendo várias linhas: ");
        while(linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();

    }
}
