package curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Testes;

import curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos.Cliente;
import curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos.ContaCorrente;

import java.io.*;

public class TesteSerialização {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Serializando um objeto em HERANÇA!

        Cliente cliente = new Cliente();
        cliente.setNome("Wilson");
        cliente.setCpf("580");
        cliente.setProfissao("carnaceiro");

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.setTitular(cliente);
        cc.deposita(220);

        // SERIALIZAÇÃO.
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();
    }
}
