import java.util.Scanner;
import java.util.Locale;

public class entradaDadosJava {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = scan.nextLine();
        System.out.println("Seu nome é: " + nome);

        // Armazenando dados com ponto flutuante
        System.out.println("Digite seu salario: ");
        double salario = scan.nextDouble();
        System.out.printf("Seu salario é: R$ %.2f%n", salario);
        System.out.printf("Você digitou: %.2f%n", salario);

        // Leitura de apenas um caractere
        System.out.println("Sexo: (M/F)");
        char sexo = scan.next().charAt(0);
        System.out.println("Sexo: " + sexo);

        // Ler vários dados na mesma linha
        String a1;
        int a2;
        double a3;

        System.out.println("Digite uma String");
        a1 = scan.next();
        System.out.println("Digite um inteiro");
        a2 = scan.nextInt();
        System.out.println("Digite um decimal");
        a3 = scan.nextDouble();
        scan.nextLine(); // Consome a quebra de linha pendente
        System.out.println(a1 + " " + a2 + " " + a3);

        // Lendo um texto até a primeira quebra de linha
        String s1, s2, s3;
        s1 = scan.nextLine();
        s2 = scan.nextLine();
        s3 = scan.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        scan.close();
    }
}
