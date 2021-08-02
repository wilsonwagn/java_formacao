package curso01_Java_JRE_e_JDK.c6_laços;

import javax.swing.*;

public class TestaLaços {
    public static void main(String[] args) {
        /* ————————————————————————— WHILE ————————————————————————— */

        int cont = 0;
        while (cont <= 10) {
            System.out.println(cont);
            cont += 1; //contador ++
        }
        System.out.println("FIM");

        /* ————————————————————————— FOR ————————————————————————— */
        for (int cont2 = 0; cont2 <= 10; cont2++) {
            System.out.println("Cont2: " + (cont2));
        }
        //Break = para o laço.
        //Taboada:
        for (int mult1 = 1; mult1 <= 10; mult1++) {
            System.out.println("Taboada do valor: " + mult1);
            for (int mult2 = 1; mult2 <= 10; mult2++) {
                System.out.println((mult1 + "x" + mult2 + " = ") + (mult1 * mult2));
            }
        }
    }
}

