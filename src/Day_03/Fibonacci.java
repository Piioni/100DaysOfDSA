package Day_03;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        String str = """
                The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, 
                such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
                F(0) = 0, F(1) = 1
                F(n) = F(n - 1) + F(n - 2), for n > 1.
                """;

        String example = """
                Example:
                
                Input: n = 2
                Output: 1
                Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
                """;

        System.out.println(str);
        System.out.println(example);

        System.out.println("Hastq que numero quieres la serie de fibonacci?");
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        try {
            numero = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Por favor ingresa un numero valido");
        }

        System.out.println("El valor de la serie de fibonacci hasta el numero: " + numero + " es: " + fibonnaci(numero));

    }

    public static int fibonnaci(int n) {
        // Caso base
        if ( n< 2) {
            return n;
        }
        // Llamada recursiva
        return fibonnaci(n - 1) + fibonnaci(n - 2);
    }
}
