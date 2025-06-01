package estruturaSequencial;

import java.util.Locale;

public class saidaDeDados {

    public static void main(String[] args) {
        /*
        Quando o programa informa dados para o usuário
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

    }

}
