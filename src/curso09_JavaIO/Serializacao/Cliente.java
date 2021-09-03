package curso09_JavaIO.Serializacao;

import java.io.Serializable;

public class Cliente implements Serializable {
    //Boa prática é colocar serial versão quando o objeto for gravado no HD, Rede etc..
    private static final long serialVersionUID = 8402246750979131646L;
    private String nome;
    private String cpf;
    private String profissao;

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

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
