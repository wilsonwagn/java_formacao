package curso09_JavaIO;

import java.io.*;

public class Test4EscrevendoArquivos {
    public static void main(String[] args) throws IOException{

        //Criando arquivo:
        OutputStream fos = new FileOutputStream("texto4.txt"); // System.out = Se deseja printar a escrita ;
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw); //String para escrever no arquivo.

        //Escrevendo no arquivo:
        InputStream fis = System.in;
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine(); //Lendo a linha do input
        while(linha != null && !linha.isEmpty()){ //Enquanto a linha for diferente de nula ou vazia, continue rodando:
            bw.write(linha);
            bw.newLine();
            // bw.flush(); combinado com System.out, mostram o que foi digitado na mesma hora.
            linha = br.readLine();
        }
        bw.close();
        br.close();




    }
}
