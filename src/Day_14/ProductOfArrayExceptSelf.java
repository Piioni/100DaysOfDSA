package Day_14;

import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

        String str = """
                Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
                The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
                You must write an algorithm that runs in O(n) time and without using the division operation.
                """;


        String example = """
                Example 1:
                Input: nums = [1,2,3,4]
                Output: [24,12,8,6]
                """;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int[] result = productExceptSelf(nums);
            System.out.println("Output: ");
            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

    }

    // Time complexity: O(n)
    public static int[] productExceptSelf ( int[] nums){

        int size = nums.length;
        int[] result = new int[size];

        // Paso 1: producto de todos los elementos a la izquierda de cada índice
        result[0] = 1;
        for (int i = 1; i < size; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Paso 2: producto de todos los elementos a la derecha de cada índice
        int rightProduct = 1;
        for (int i = size - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }


    // Time complexity: O(n^2)
    public static int[] productExceptSelf2 ( int[] nums){

        int size = nums.length;
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            int product = 1;
            for (int j = 0; j < size; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }
            result[i] = product;
        }

        return result;
    }
}