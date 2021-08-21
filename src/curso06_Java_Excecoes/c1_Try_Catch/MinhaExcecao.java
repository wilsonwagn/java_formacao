package curso06_Java_Excecoes.c1_Try_Catch;
/*
// Para o códgo fluxo2. | Unchecked

public class MinhaExcecao extends RuntimeException{
    public MinhaExcecao(String msg){
        super(msg);
    }
}*/

// Para o codigo fluxo3 | Checked
public class MinhaExcecao extends Exception{
    public MinhaExcecao(String msg){
        super(msg);
    }
}
