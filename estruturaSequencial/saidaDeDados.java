package estruturaSequencial;

import java.time.LocalDate;
import java.util.Locale;

public class saidaDeDados {

    public static void main(String[] args) {
        /*
         * Quando o programa informa dados para o usuário
         */
        System.out.print("Sem quebra de linha");
        System.out.println("com quebra de linha");
        int y = 32;
        System.out.println(y);

        double x = 10.3578458475698;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("Resultado: " + x + " metros.");
        System.out.printf("Resultado: %.2f metros.%n", x);

        String nome = "Cristiano Ronaldo";
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - 1985;
        double salario = 20000000.00;
        System.out.printf("%s tem %d anos e ganha anualmente %.2f de euros.%n", nome, idade, salario);
    }

}
