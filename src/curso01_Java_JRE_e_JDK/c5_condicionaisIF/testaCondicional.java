package curso01_Java.c5_condicionaisIF;

public class testaCondicional {
    public static void main(String[] args) {
        /* ————————————————————————— IF/ELSE ————————————————————————— */
        int idade = 10;
        String acompanhado = "Sim";
        if (idade >= 18) {
            System.out.println("Maior de Idade.");
        } else {
            if (acompanhado == "Sim") {
                System.out.println(("Menor de Idade, mas está acompanhado."));
            }
        }
        /* ————————————————————————— OR/AND (|| / &&)————————————————————————— */
        //
        if (idade >= 18 || acompanhado == "Sim") {
            System.out.println("Pode entrar");
        } else {
            System.out.println("Não pode entrar");
        }
        /* ————————————————————————— BOOLEANO ————————————————————————— */
        boolean testando = true;
        if (testando == true); {
            System.out.println("entrou");
        }
        boolean testando2 = idade > 9910;
        System.out.println(testando2);

        /* ————————————————————————— SWITCH ————————————————————————— */
        /* >>>> Apenas para casos de IF's gigantes, veja um exemplo abaixo:

        public class TestaMes {

        public static void main(String[] args) {

            int mes = 10;

            switch (mes) {
                case 1:
                    System.out.println("O mês é Janeiro");
                    break;
                case 2:
                    System.out.println("O mês é Fevereiro");
                    break;
                case 3:
                    System.out.println("O mês é Março");
                    break;
                case 4:
                    System.out.println("O mês é Abril");
                    break;
                case 5:
                    System.out.println("O mês é Maio");
                    break;
                case 6:
                    System.out.println("O mês é Junho");
                    break;
                case 7:
                    System.out.println("O mês é Julho");
                    break;
                case 8:
                    System.out.println("O mês é Agosto");
                    break;
                case 9:
                    System.out.println("O mês é Setembro");
                    break;
                case 10:
                    System.out.println("O mês é Outubro");
                    break;
                case 11:
                    System.out.println("O mês é Novembro");
                    break;
                case 12:
                    System.out.println("O mês é Dezembro");
                    break;
                default:
                    System.out.println("Mês inválido");
                    break;
            }
        }
    }
         */

    }
}
