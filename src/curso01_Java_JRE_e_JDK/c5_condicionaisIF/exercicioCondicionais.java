package curso01_Java_JRE_e_JDK.c5_condicionaisIF;

public class exercicioCondicionais {
    public static void main(String[] args) {
        double salario = 4509;
        if (salario >= 1900 && salario <= 2800){
            System.out.println("Seu salário é: " + (salario-142));
        } else if (salario >= 2800.01 && salario <= 3751){
            System.out.println("Seu salario2 é: " + (salario-350));
        } else if (salario >= 3751.01 && salario <= 4664){
            System.out.println("Seu salario3 é: " + (salario-636));
            }
        }
}
