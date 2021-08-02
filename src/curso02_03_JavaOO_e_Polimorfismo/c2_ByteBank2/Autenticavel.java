package curso02_03_JavaOO_e_Polimorfismo.c2_ByteBank2;

// Contrato Autenticável
// Classe abstrata / interface
public abstract interface Autenticavel { // extends Funcionario{


    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);

}
