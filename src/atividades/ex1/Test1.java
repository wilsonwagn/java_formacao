package atividades.ex1;

public class Test1 {
    public static void main(String[] args) {
        Pessoa novaPessoa = new Pessoa();
        novaPessoa.setNome("Nicki Minaj");
        novaPessoa.setAltura(157.5);
        novaPessoa.setDataNascimento("14/01/1999");
        System.out.println("Meu nome é "+ novaPessoa.getNome());
    }
}
