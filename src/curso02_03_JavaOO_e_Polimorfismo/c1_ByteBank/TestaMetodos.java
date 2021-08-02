package curso02_03_JavaOO_e_Polimorfismo.c1_ByteBank;

public class TestaMetodos {
    public static void main(String[] args) {
        /* ——————————————————————————————————————————————————————
        Conta contaWilson = new Conta();
        //Conta 01 — Primeiros testes
        contaWilson.saldo = 100;
        contaWilson.deposita(50);
        System.out.println(contaWilson.saldo);
        boolean conseguiuRetirar = contaWilson.saca(20);
        System.out.println(contaWilson.saldo);
        System.out.println(conseguiuRetirar);

        //Conta 02 — Transferindo entre objetos
        Conta contaNicki = new Conta();
        contaNicki.deposita(5000);
        System.out.println(contaNicki.saldo);
        boolean confere = contaNicki.transfere(1000, contaWilson);

        if(confere){
            System.out.println("Tranferência realizada com Sucesso.");
        } else {
            System.out.println("Faltando dinheiro");
        }

        //Conta 03 - Criando mais objetos
        Cliente Wilson2 = new Cliente();
        Wilson2.nome = "Wilson Wagner";
        Wilson2.cpf = "988.041.558-47";
        Wilson2.profissao = "Desenvolvedor";

        Conta contaWilson2 = new Conta();
        contaWilson2.deposita(100);
            // Vinculando a conta <=> cliente.
        contaWilson2.titular = Wilson2;

        System.out.println(contaWilson2.titular.nome);

        ——————————————————————————————————————————————————————
        contaWilson.titular = new Cliente();
        System.out.println(contaWilson.titular);
        contaWilson.titular.nome = "Wilson Wagner";
        contaWilson.deposita(10000);
        Double SaldoAtual = contaWilson.getSaldo();
        System.out.println("Meu saldo atual é "+SaldoAtual);
        —————————————————————————————————————————————————————— */
        //Testando após encapsular tudo.
        /*
        Conta contaWilson2 = new Conta();
        Cliente Wilson = new Cliente();
        Wilson.setNome("Wilson Wagner");
        contaWilson.setTitular(Wilson);

        String nomeCliente = contaWilson.getTitular().getNome();
        System.out.println(nomeCliente);
        —————————————————————————————————————————————————————— */
        Conta contaWil= new Conta(1137, 995482);

        System.out.println("Qual agência da conta de Wilson: "+ contaWil.getAgencia());
        contaWil.setAgencia(123456);

        Conta conta = new Conta(1337, 24226);
        Conta conta2 = new Conta(1337, 16549);
        Conta conta3 = new Conta(2112, 14660);

        int quantidadeDeContas = Conta.getTotal();
        System.out.println(quantidadeDeContas+ " contas foram criadas ");

    }
}
