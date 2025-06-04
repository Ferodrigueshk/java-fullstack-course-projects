package estruturaSequencial;

public class processamentodeDadosCasting {
    public static void main(String[] args) {
        int x;
        double y;
        x = 5;
        y = 2 * x;
        System.out.println(x);
        System.out.println(y);
        System.out.println("--- ");

        /* __________________Parte B da Aula_________________________ */
        System.out.println("--- ");
        double b, B, h, area;
        b = 6;
        B = 8;
        h = 5;

        area = (b + B) / 2 * h;
        System.out.println(b);
        System.out.println(B);
        System.out.println(h);
        System.out.println(area);
        System.out.println("--- ");

        /* __________________Parte C da Aula_________________________ */

        float baseMenor, baseMaior, altura, areaTrapezio;
        baseMenor = 6f;
        baseMaior = 8f;
        altura = 5f;

        areaTrapezio = (baseMenor + baseMaior) / 2 * altura;
        System.out.println(baseMenor);
        System.out.println(baseMaior);
        System.out.println(altura);
        System.out.println(areaTrapezio);

        System.out.println("--- ");
        /* __________________Parte D da Aula_________________________ */

        System.out.println("--- ");
        int num1, num2;
        double resultado2;
        num1 = 5;
        num2 = 2;
        resultado2 = num1 / num2;
        System.out.println(resultado2);
        System.out.println("--- ");

    }

}
