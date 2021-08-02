package curso02_03_JavaOO_e_Polimorfismo.c2_ByteBank2;

//Esse sistema será visualizado por apenas alguns funcionários:
public class SistemaInterno {
    private int senha = 0000;

    public void autentica(Autenticavel g){
        boolean autenticou = g.autentica(this.senha);
        if(autenticou) {
            System.out.println("Pode entrar no sistema!");
        } else {
            System.out.println("Não pode entrar no sistema!");
        }
    }
}
