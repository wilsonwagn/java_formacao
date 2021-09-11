package curso10_Java_Collections.c6_TreeSet;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario> {

    @Override
    public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
        return funcionario.getIdade() - outroFuncionario.getIdade();
    }

}
