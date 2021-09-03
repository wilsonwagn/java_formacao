package curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Testes;

import curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos.ContaCorrente;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDeserializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // DESERIALIZAÇÃO.
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
        ContaCorrente cCorrente = (ContaCorrente) ois.readObject();
        ois.close();
        System.out.println(cCorrente.getSaldo());
        System.out.println(cCorrente.getTitular());
    }
}
