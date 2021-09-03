package curso09_JavaIO;

import java.io.*;
import java.util.*;

public class Test5Otimizacao2 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(new File("Contas.csv"));

        while(scanner.hasNextLine()){ //Enquanto tiver dados por linha
            String linha = scanner.nextLine();
            Scanner linhaScanner = new Scanner(linha);

            linhaScanner.useDelimiter(","); //Usando delimitador de viruglas
            linhaScanner.useLocale(Locale.US); //Usando as regras locais, para nao ter problemas no Double etc.

            String valor1 = linhaScanner.next();
            int valor2 = linhaScanner.nextInt();
            int valor3 = linhaScanner.nextInt();
            String valor4 = linhaScanner.next();
            double valor5 = linhaScanner.nextDouble();

            //Locale = formatar de acordo com o país.
            String printFormatado = String.format(new Locale("pt", "BR"), "%s | %04d | %08d | %s | %.1f", valor1, valor2, valor3, valor4, valor5);
            System.out.println(printFormatado);
            linhaScanner.close();
        }

        scanner.close();
    }
}
