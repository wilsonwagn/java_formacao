package curso09_JavaIO.Serializacao;

import java.io.*;

public class Test8SerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Serializando um objeto
        /*
        Cliente cliente = new Cliente();
        cliente.setNome("Wilson");
        cliente.setCpf("580");
        cliente.setProfissao("carnaceiro");



        // Transfomarando para binario no arquivo de SERIALIZAÇÃO.
/*
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();*/

        // Pegando de binario para texto.

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getNome());
    }
}
