package curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos;

public class CalculadorDeImposto {
    private double totalImposto;

    public void registra(Tributavel t) {

        double valor = t.getValorImposto();
        this.totalImposto += valor;

    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
