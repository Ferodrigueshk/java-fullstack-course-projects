package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class entradaDadosJava {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        // System.out.println("Digite seu nome completo: ");
        // String nome = scan.nextLine();
        // System.out.println("Seu nome é: " + nome);

        /*
         * ------------- Armazenando dados com ponto flutuante ----------------
         */
        // System.out.println("Digite seu salario: ");
        // double salario = scan.nextDouble();
        // System.out.printf("Seu salario é: R$ %.2f%n ", salario);
        // System.out.printf("Você digitou: %.2f%n", salario);

        /*
         * ------------- Leitura de apenas um caractere ----------------
         */
        // System.out.println("Sexo: (M/F)");
        // char sexo = scan.next().charAt(0);
        // System.out.println("Sexo: " + sexo);

        /*
         * ------------- Para ler vários dados na mesma linha ----------------
         */
        // String a1;
        // String a2;
        // String a3;
        // System.out.println("Digite a variavel a1");
        // a1 = scan.next();
        // System.out.println("Digite a variavel a2");
        // a2 = scan.next();
        // System.out.println("Digite a variavel a3");
        // a3 = scan.next();
        // System.out.println(a1 + " " + a2 + " " + a3);

        /*
         * ------------- Continuação da aula ----------------
         */

        /*
         * ------------- Lendo um texto até a primeira quebra de linha ---------------
         */

        String s1, s2, s3;
        int x1;

        System.out.println("Digite um número inteiro");
        x1 = scan.nextInt();

        System.out.println("Digite S1");
        s1 = scan.nextLine();
        System.out.println("Digite S2");
        s2 = scan.nextLine();
        System.out.println("Digite S3");
        s3 = scan.nextLine();
        

        System.out.println("Dados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        /*
         * ------------- Quebra de linha pendente ---------------
         */

        scan.close();
    }
}
