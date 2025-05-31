package estruturaSequencial;

public class expressoesAritmeticas {

    public static void main(String[] args) {
        /*
        Adição (+)
        subtração (-)
        multiplicação (*)
        divisão (/)
        mod (%)
        potencia Math.pow()
        
        Esses operadores seguem uma regra de precedência
         */
        float calc01 = 1 + 1;
        float calc02 = 2 - 1;
        float calc03 = 3 * 3;
        float calc04 = 13 / 2;
        float calc05 = 15 % 2;
        float calc06 = (5 + 2) - (2 * 2);
        double calc07 = Math.pow(3, 2);// 3 ao quadrado

        System.out.println(calc01);
        System.out.println(calc02);
        System.out.println(calc03);
        System.out.println(calc04);
        System.out.println(calc05);
        System.out.println(calc06);
        System.out.println(calc07);

    }

}
