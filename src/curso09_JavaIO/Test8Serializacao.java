package curso09_JavaIO;

import java.io.*;

public class Test8Serializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Transfomarando para binario no arquivo de SERIALIZAÇÃO.
        /*
        String nome = "Nico Steppat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        oos.writeObject(nome);
        oos.close();*/

        // Pegando de binario para texto.
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nome = (String) ois.readObject();
        ois.close();
        System.out.println(nome);
    }
}
