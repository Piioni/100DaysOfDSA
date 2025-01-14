package Day_02;

public class Main {
    public static void main(String[] args) {

        String str = """
                Given an integer n, return true if it is a power of two. Otherwise, return false.
                An integer n is a power of two, if there exists an integer x such that n == 2x.
                """;

        String example = """
                Example 1:
                Input: n = 1
                Output: true
                Explanation: 2^0 = 1
                """;

        System.out.println(str);
        System.out.println("\n" + example);

        int n = 1;
        System.out.println("Is " + n + " a power of two? " + isPowerOfTwoMathPow(n));

    }


    public static boolean isPowerOfTwoMathPow(int n) {
        // Check if the number is 1
        if (n == 1) {
            return true;
        }

        // Check if the number is negative or odd number
        if (n <= 0 || (n % 2 != 0)) {
            return false;
        }

        // Check if the number is a power of two
        for (int i = 0; i < 31; i++) {
            if (Math.pow(2, i) == n) {
                return true;
            }

        }
        return false;
    }

    public static boolean isPowerOfTwoLog(int n) {
        // Check if the number is 1
        if (n == 1) {
            return true;
        }

        // Check if the number is negative or odd number
        if (n <= 0 || (n % 2 != 0)) {
            return false;
        }

        // Check if the number is a power of two
        return (Math.log10(n) / Math.log10(2)) % 1 == 0;
    }

    public static boolean isPowerOfTwoBitWise (int n) {
        // Check if the number is 1
        if (n == 1) {
            return true;
        }

        // Check if the number is negative or odd number
        if (n <= 0 || (n % 2 != 0)) {
            return false;
        }

        // Check if the number is a power of two
        return (n & (n - 1)) == 0;
    }
}
