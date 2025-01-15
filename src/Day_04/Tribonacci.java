package Day_04;

import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        String str= """
                The Tribonacci sequence Tn is defined as follows:\s
                T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
                Given n, return the value of Tn.
                """;

        String str2 = """
                Example 1:
                Input: n = 4
                Output: 4
                Explanation:
                T_3 = 0 + 1 + 1 = 2
                T_4 = 1 + 1 + 2 = 4
                """;

        System.out.println(str);
        System.out.println(str2);

        System.out.println("Hasta que numero quieres la serie de tribonacci?");
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        try {
            numero = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Por favor ingresa un numero valido");
        }
        System.out.println("El valor de la serie de tribonacci hasta el numero: " + numero + " es: " + tribonacci(numero));

    }

    public static int tribonacci(int n) {
        // Casos base
        if (n < 3) {
            return n == 0 ? 0 : 1;
        }

        // Declarar las variables iniciales
        int a = 0, b = 1, c = 1, d = 0;
        for (int i = 3; i <= n; i++) {
            // Calcular el siguiente numero
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return d;
    }
}
