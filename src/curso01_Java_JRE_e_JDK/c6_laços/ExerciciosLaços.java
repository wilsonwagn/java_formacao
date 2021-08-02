package curso01_Java_JRE_e_JDK.c6_laços;

public class ExerciciosLaços {
    public static void main(String[] args) {
        /* ————————————————————————— Exercicio 01 ————————————————————————— */
        //Multiplicavel por 3 de 0 a 100:
        for(int val = 1; val <= 100; val++){
            if(val%3==0){
                System.out.println("O valor "+val+" é multiplicavel por 3.");
            }
        }
        /* ————————————————————————— Exercicio 02 ————————————————————————— */
        //Fatorial de 1 a 10:
        for(int val = 1; val <= 10; val++){
            int resultado = 1;
            for(int val2 = 1; val2<=val;val2++){
                resultado *= val2;
                }
            System.out.println("O fatorial de " + val + ": " + resultado);
        }
    }
}
