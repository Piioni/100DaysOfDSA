package Day_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Palindrome number

        String str = """
                Given an integer x, return true if x is a\s
                palindrome
                , and false otherwise.
                
                An integer is a palindrome when it reads the same backward as forward.
                """;

        String example  = """
                Example 1:
                Input: x = 121
                Output: true
                Explanation: 121 reads as 121 from left to right and from right to left.
                """;

        System.out.println(str);
        System.out.println("\n" + example);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x= 0;
        try {
            x = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Invalid input");
        }

        if (isPalindrome(x)) {
            System.out.println("El numero: " + x + " es palindromo");
        } else {
            System.out.println("El numero: " + x + " no es palindromo");
        }


    }

    public static boolean isPalindrome(int x) {
        // if x is negative, it can't be a palindrome
        if (x < 0) {
            return false;
        }
        int valor = x;
        int reverse = 0;
        // reverse the number using modules and division
        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return valor == reverse;
    }
}
