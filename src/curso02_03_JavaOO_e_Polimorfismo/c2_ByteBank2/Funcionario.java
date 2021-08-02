package curso02_03_JavaOO_e_Polimorfismo.c2_ByteBank2;

//Classe Mãe | Classe Abstrata
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario; //Público apenas para subclasses

    /* PROBLEMA QUE SERA RESOLVIDO LOGO EM SEGUIDA*/
    private int senha = 0000;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public abstract double getBonificacao();
    // ——————————————————————————————————————————— GET e SET ——————————————————————————————————————————————————————————
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
