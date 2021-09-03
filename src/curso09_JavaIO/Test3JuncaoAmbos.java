package curso09_JavaIO;

import java.io.*;

public class Test3JuncaoAmbos {
    public static void main(String[] args) throws IOException {
        // Escrevendo e Criando um arquivo:
        OutputStream fos = new FileOutputStream("texto3.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Criando um novo arquivo \n\ndo ZEROOOOOOOOOO! \n\nahahahhahahahahahhaha muahhhhhhhhhhhhhhhh!!!!!!!!!");
        bw.newLine(); //Pulando uma linha
        bw.write("Linha pulada com sucesso!");
        bw.close();

        // Abrindo e lendo:
        FileInputStream fis = new FileInputStream("texto3.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();
        while(linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }
        bw.close();


    }
}
