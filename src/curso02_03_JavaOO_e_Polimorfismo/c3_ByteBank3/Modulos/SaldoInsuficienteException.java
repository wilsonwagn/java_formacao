package curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos;

public class SaldoInsuficienteException extends RuntimeException{
    public SaldoInsuficienteException(String msg){
        super(msg);
    }
}
