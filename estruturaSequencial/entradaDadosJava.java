import java.util.Scanner;
import java.util.Locale;

public class entradaDadosJava {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nome = scan.nextLine();
        System.out.println("Seu nome é: " + nome);

        /* ------------- Armazenando dados com ponto flutuante ---------------- */
        System.out.println("Digite seu salario: ");
        double salario = scan.nextDouble();
        System.out.printf("Seu salario é: R$ %.2f%n ", salario);
        System.out.printf("Você digitou: %.2f%n", salario);

        /* ------------- Leitura de apenas um caractere ---------------- */
        System.out.println("Sexo: (M/F)");
        char sexo = scan.next().charAt(0);
        System.out.println("Sexo: " + sexo);

        /* ------------- Para ler vários dados na mesma linha ---------------- */
        String a1;
        int a2;
        double a3;

        a1 = scan.next();
        a2 = scan.nextInt();
        a3 = scan.nextDouble();
        System.out.println(a1 + " " + a2 + " " + a3);

        /* ------------- Continuaão da aula ---------------- */

        scan.close();
    }
}
